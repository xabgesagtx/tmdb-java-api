# The Movie DB Java API (work in progess)

Yet another tmdb java api to access [The Movie DB](https://www.themoviedb.org/).

However this one is experimental and meant for usage in my personal projects so far. This means not all endpoints have been tested.

Two main approaches are used:
1. the classes are autogenerated
2. project aims at using minimal dependencies

## Autogenerated classes

* the schema is of the API is read 
* a model for the whole api is created resolving references and traits (some fixes are applied)
* using codemodel and a custom restclient interface api methods, request types and response types are generated

## Dependencies
* the project uses the native java 11 http client (which can be replaced by your own implementation)
* jackson is used for JSON reading and writing
* slf4j is used for logging

## Alternatives

If you are looking for more finished java libraries for the tmdb API, have a look at the following projects:

* https://github.com/UweTrottmann/tmdb-java
* https://github.com/holgerbrandl/themoviedbapi
* https://github.com/Omertron/api-themoviedb

Also, there is a full and excellent [documentation](https://developers.themoviedb.org/3/) on the API.

## Development

Currently (=workaround), the api code can regernerated using the following command:
```shell
mvn compile exec:java
```

Future plans: Use a separate maven plugin in another repository to generate code (multi-module project doesn't allow a plugin from another module)