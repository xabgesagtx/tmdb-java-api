package com.github.xabgesagtx.tmdb;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.xabgesagtx.tmdb.api.*;
import com.github.xabgesagtx.tmdb.api.external.ApiSpec;
import com.github.xabgesagtx.tmdb.api.external.ComplexTypeSpec;
import com.github.xabgesagtx.tmdb.codegen.CodeGenerator;
import com.github.xabgesagtx.tmdb.codegen.ModelGenerator;
import com.github.xabgesagtx.tmdb.codegen.model.ObjectType;
import com.github.xabgesagtx.tmdb.codegen.model.Resource;
import com.sun.codemodel.*;
import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

import java.io.File;
import java.io.IOException;
import java.net.http.HttpClient;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class CodeGeneratorApplication {

    public static void main(String[] args) throws JClassAlreadyExistsException, IOException {
//        DeserializeExample.deserialize();
        createApi();
//        createMovieClass();
//        readAndWriteFullSpec();
//        readAndWriteTest();
//        generateExampleCode();
    }

    private static void createApi() throws IOException {
        FullSpecReader specReader = new FullSpecReader();
        ApiSpec spec = specReader.read(new File("api_v3.json"));
        ApiSpecToResourceConverter apiSpecToResourceConverter = new ApiSpecToResourceConverter();
        List<Resource> resources = apiSpecToResourceConverter.convert(spec);
        CodeGenerator codeGenerator = new CodeGenerator();
        codeGenerator.generateFor(resources, "com.github.xabgesagtx.tmdb", new File("tmdb-api/src/main/java"));
    }

    private static void readAndWriteFullSpec() throws IOException {
        FullSpecReader specReader = new FullSpecReader();
        ApiSpec spec = specReader.read(new File("api_v3.json"));
        List<Resource> refTypes = new ApiSpecToResourceConverter().convert(spec);
        String json = new ObjectMapper().setDefaultPropertyInclusion(JsonInclude.Include.NON_EMPTY).writerWithDefaultPrettyPrinter().writeValueAsString(refTypes);
        System.out.println(json);
    }

    private static void readAndWriteTest() throws IOException {
        ObjectMapper objectMapper = new ObjectMapperFactory().create();
        ComplexTypeSpec complexTypeSpec = objectMapper.readValue(new File("movie-details.json"), ComplexTypeSpec.class);
        String json = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(complexTypeSpec);
        System.out.println(json);
    }

    private static void generateExampleCode() throws JClassAlreadyExistsException, IOException {
        JCodeModel model = new JCodeModel();

        JDefinedClass movieClass = model._class("com.github.xabgegesagtx.resources.Movie");
        movieClass.annotate(Value.class);
        movieClass.annotate(Builder.class);
        movieClass.annotate(Jacksonized.class);
        movieClass.field(JMod.NONE, String.class, "title");
        JDefinedClass movieResourceClass = model._class(JMod.PUBLIC, "com.github.xabgegesagtx.resources.MovieResource", ClassType.CLASS);
        JClass rawOptional = model.ref(Optional.class);
        JClass movieOptional = rawOptional.narrow(movieClass);
        JMethod findById = movieResourceClass.method(JMod.PUBLIC, movieOptional, "findById");
        findById.body()._return(model.ref(Optional.class).staticInvoke("empty"));
        JDefinedClass apiClass = model._class(JMod.PUBLIC, "com.github.xabgegesagtx.TmdbApi", ClassType.CLASS);
        JFieldVar clientField = apiClass.field(JMod.PRIVATE + JMod.FINAL, HttpClient.class, "client");
        JFieldVar movieResourceField = apiClass.field(JMod.PRIVATE + JMod.FINAL, movieResourceClass, "movies");
        JMethod constructor = apiClass.constructor(JMod.PUBLIC);
        JVar clientParam = constructor.param(JMod.FINAL, HttpClient.class, "client");
        constructor.body().assign(clientField, clientParam);
        JMethod moviesMethod = apiClass.method(JMod.PUBLIC, movieResourceClass, "movies");
        moviesMethod.body()._return(movieResourceField);
        model.build( new File("output"));
    }

}
