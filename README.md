
# Getting Started with Words API

## Introduction

Words API lets you retrieve information about English words, including definitions, synonyms, rhymes, pronunciation, syllables, and frequency of usage. It also can tell you about relationships between words, for instance that “math” has categories like “algebra” and “geometry”, or that a “finger” is part of a “hand”.

## Install the Package

Install the SDK by adding the following dependency in your project's pom.xml file:

```xml
<dependency>
  <groupId>io.github.sufyankhanrao</groupId>
  <artifactId>apimatic-words-api-sdk</artifactId>
  <version>0.0.5</version>
</dependency>
```

You can also view the package at:
https://mvnrepository.com/artifact/io.github.sufyankhanrao/apimatic-words-api-sdk/0.0.5

## Test the SDK

The generated code and the server can be tested using automatically generated test cases.
JUnit is used as the testing framework and test runner.

In Eclipse, for running the tests do the following:

1. Select the project WordsAPILib from the package explorer.
2. Select `Run -> Run as -> JUnit Test` or use `Alt + Shift + X` followed by `T` to run the Tests.

## Initialize the API Client

**_Note:_** Documentation for the client can be found [here.](https://www.github.com/sufyankhanrao/apimatic-words-api-java-sdk/tree/0.0.5/doc/client.md)

The following parameters are configurable for the API Client:

| Parameter | Type | Description |
|  --- | --- | --- |
| `httpClientConfig` | [`ReadonlyHttpClientConfiguration`](https://www.github.com/sufyankhanrao/apimatic-words-api-java-sdk/tree/0.0.5/doc/http-client-configuration.md) | Http Client Configuration instance. |
| `xRapidAPIKey` | `String` | This is an API key from RapidAPI. |

The API client can be initialized as follows:

```java
WordsAPIClient client = new WordsAPIClient.Builder()
    .httpClientConfig(configBuilder -> configBuilder
            .timeout(0))
    .customHeaderAuthenticationCredentials("X-RapidAPI-Key")
    .build();
```

## Authorization

This API uses `Custom Header Signature`.

## List of APIs

* [AP Is](https://www.github.com/sufyankhanrao/apimatic-words-api-java-sdk/tree/0.0.5/doc/controllers/ap-is.md)

## Classes Documentation

* [Utility Classes](https://www.github.com/sufyankhanrao/apimatic-words-api-java-sdk/tree/0.0.5/doc/utility-classes.md)
* [HttpRequest](https://www.github.com/sufyankhanrao/apimatic-words-api-java-sdk/tree/0.0.5/doc/http-request.md)
* [HttpResponse](https://www.github.com/sufyankhanrao/apimatic-words-api-java-sdk/tree/0.0.5/doc/http-response.md)
* [HttpStringResponse](https://www.github.com/sufyankhanrao/apimatic-words-api-java-sdk/tree/0.0.5/doc/http-string-response.md)
* [HttpContext](https://www.github.com/sufyankhanrao/apimatic-words-api-java-sdk/tree/0.0.5/doc/http-context.md)
* [HttpBodyRequest](https://www.github.com/sufyankhanrao/apimatic-words-api-java-sdk/tree/0.0.5/doc/http-body-request.md)
* [HttpCallback Interface](https://www.github.com/sufyankhanrao/apimatic-words-api-java-sdk/tree/0.0.5/doc/http-callback-interface.md)
* [Headers](https://www.github.com/sufyankhanrao/apimatic-words-api-java-sdk/tree/0.0.5/doc/headers.md)
* [ApiException](https://www.github.com/sufyankhanrao/apimatic-words-api-java-sdk/tree/0.0.5/doc/api-exception.md)
* [Configuration Interface](https://www.github.com/sufyankhanrao/apimatic-words-api-java-sdk/tree/0.0.5/doc/configuration-interface.md)
* [HttpClientConfiguration](https://www.github.com/sufyankhanrao/apimatic-words-api-java-sdk/tree/0.0.5/doc/http-client-configuration.md)
* [HttpClientConfiguration.Builder](https://www.github.com/sufyankhanrao/apimatic-words-api-java-sdk/tree/0.0.5/doc/http-client-configuration-builder.md)

