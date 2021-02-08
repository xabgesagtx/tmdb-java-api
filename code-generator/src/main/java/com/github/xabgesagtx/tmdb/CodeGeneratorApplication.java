package com.github.xabgesagtx.tmdb;

import com.github.xabgesagtx.tmdb.api.ApiSpecToResourceConverter;
import com.github.xabgesagtx.tmdb.api.FullSpecReader;
import com.github.xabgesagtx.tmdb.api.external.ApiSpec;
import com.github.xabgesagtx.tmdb.codegen.CodeGenerator;
import com.github.xabgesagtx.tmdb.codegen.model.Resource;
import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Slf4j
public class CodeGeneratorApplication {

    public static void main(String[] args) throws IOException {
        if (args.length > 1) {
            createApi(args[0], args[1]);
        } else {
            log.info("Using default arguments for generating api");
            createApi("tmdb-api/api_v3.json", "tmdb-api/src/main/java");
        }
    }

    private static void createApi(String schemaPath, String outputDir) throws IOException {
        FullSpecReader specReader = new FullSpecReader();
        ApiSpec spec = specReader.read(new File(schemaPath));
        ApiSpecToResourceConverter apiSpecToResourceConverter = new ApiSpecToResourceConverter();
        List<Resource> resources = apiSpecToResourceConverter.convert(spec);
        CodeGenerator codeGenerator = new CodeGenerator();
        codeGenerator.generateFor(resources, "com.github.xabgesagtx.tmdb", new File(outputDir));
    }

}
