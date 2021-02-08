package com.github.xabgesagtx.tmdb;

import com.github.xabgesagtx.tmdb.api.ApiSpecToResourceConverter;
import com.github.xabgesagtx.tmdb.api.FullSpecReader;
import com.github.xabgesagtx.tmdb.api.external.ApiSpec;
import com.github.xabgesagtx.tmdb.codegen.CodeGenerator;
import com.github.xabgesagtx.tmdb.codegen.model.Resource;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class CodeGeneratorApplication {

    public static void main(String[] args) throws IOException {
        createApi();
    }

    private static void createApi() throws IOException {
        FullSpecReader specReader = new FullSpecReader();
        ApiSpec spec = specReader.read(new File("api_v3.json"));
        ApiSpecToResourceConverter apiSpecToResourceConverter = new ApiSpecToResourceConverter();
        List<Resource> resources = apiSpecToResourceConverter.convert(spec);
        CodeGenerator codeGenerator = new CodeGenerator();
        codeGenerator.generateFor(resources, "com.github.xabgesagtx.tmdb", new File("tmdb-api/src/main/java"));
    }

}
