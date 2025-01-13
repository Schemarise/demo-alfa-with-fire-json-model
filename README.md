# Demo ALFA and JSON Schema Model Integration Project

## Introduction

This project shows how easy it is to:
- Write type-safe Java code against JSON Schema imported into ALFA
- Validate and create clean JSON conforming to the model
- Import newer versions of JSON Schema to update ALFA models
- Quickly see model changes between versions 

[Suade Fire](http://github.com/SuadeLabs/fire) is used as the example JSON Schema model.  


## Published Documentation 

This project publishes documentation generated from ALFA.

As part of the Maven build (`mvn clean install -P gen-docs`) of this project, the following is generated, and published on github-pages.

1. Data Model Documentation - https://schemarise.github.io/demo-alfa-with-fire-json-model 

2. Data Model Changes - differences between versions;
    - [v24.01 and v24.04](https://schemarise.github.io/demo-alfa-with-fire-json-model/report-24.01-to-24.04.html)
    - [v24.04 and v24.07](https://schemarise.github.io/demo-alfa-with-fire-json-model/report-24.04-to-24.07.html)
    - [v24.07 and v24.10](https://schemarise.github.io/demo-alfa-with-fire-json-model/report-24.07-to-24.10.html)
    - [v24.10 and main](https://schemarise.github.io/demo-alfa-with-fire-json-model/report.html)


## Source Details

- `src/main/alfa` contains ALFA definitions imported from Fire models

- `JsonDataProcessingTest.java` contains example of reading JSON in Java and validating/processing.

- Branches of this project exist corresponding to Fire github project release tags - e.g. v24.10. 

- ALFA Change Analyzer report is configured to run against the last release tag.

- Once `mvn clean install` is run on this project.
  - `target/generated-sources/java`- contains Java generated code, conforming to the ALFA model 

- Running `mvn install -P gen-docs`, generates documentation and change analysis reports
  - `target/generated-sources/changeanalyzer` - contains report of changes between the last release and current
  - `target/generated-sources/markdown` - contains Markdown documentation for the model, and deployed to < site >

- `src/main/resources/fire` contains the JSON models and test JSON file snapshot from `github.com/SuadeLabs/fire` used to build ALFA models


### Next steps

Having the model in ALFA opens the door to many possibilities.

Interested to learn more? Get in touch with us at info@schemarise.com.

