Demo ALFA and JSON Schema Model Integration Project
===================================================

Introduction
------------
This project shows how easy it is to:
- Write type-safe Java code against JSON Schema imported into ALFA
- Validate and create clean JSON conforming to the model
- Import newer versions of JSON Schema to update ALFA models
- Quickly see model changes between versions 

Suade Fire (github.com/SuadeLabs/fire) is used as the example JSON Schema model.  

Details
-------

- `src/main/alfa` contains ALFA definitions imported from Fire models
- `JsonDataProcessingTest.java` contains example of reading JSON in Java and validating/processing.
- Branches of this project exist corresponding to Fire github project release tags - e.g. v24.10. 
- ALFA Change Analyzer report is configured to run against the last release tag.
- Once `mvn clean install` is run on this project.
  - `target/generated-sources/changeanalyzer` - contains report of changes between the last release and current
  - `target/generated-sources/java`- contains Java generated code, conforming to the ALFA model 
  - `target/generated-sources/markdown` - contains Markdown documentation for the model, and deployed to < site >
- Running `mvn install -P gen-docs`, generates documentation and change analysis reports
- `src/main/resources/fire` contains the JSON models and test JSON file snapshot from `github.com/SuadeLabs/fire` used to build ALFA models

Steps to update ALFA models based on the current Fire models
------------------------------------------------------------

1. Open a terminal and run the following commands

**Windows instructions:** 
TO BE REVIEWED
```
mkdir -P model\imported
cd model\imported
git clone https://github.com/SuadeLabs/fire.git
rmdir /s /q fire\.git
alfa -i jsonschema -o fire-in-alfa -s namespace=firemodel fire\v1-dev
cd ..\..
```

**Unix instructions:**
```
mkdir -p target/imported
cd target/imported

git clone https://github.com/SuadeLabs/fire.git
cd fire

# can be a tag instead of master
git checkout tags/v24.10

cd ../../..
rm -rf src/main/resources/fire/
mkdir -p src/main/resources/fire/
mv target/imported/fire/v1-dev src/main/resources/fire/
mv target/imported/fire/examples src/main/resources/fire/
rm -rf target/imported
```

2. Run `mvn install -P import-fire-schema` to run the JSON schema to ALFA importer.
   This will overwrite ALFA definitions in `src/main/alfa`.

