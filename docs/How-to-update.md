# How to upgrade to latest JSON Schemas

This project uses Fire JSON Schemas, which gets updates from time to time. The models imported into ALFA will need to be re-imported to reflect any changes.

This guide gives a quick overview of the steps involved.

## 1. Setup
- Prerequisites 
  - Familarity with Apache Maven, Git. 
  - Apache Maven (`mvn` command line), `git`, and Java 17 or higher.

- Clone this repository and build locally
    ```
    git clone https://github.com/Schemarise/demo-alfa-with-fire-json-model.git`
    cd demo-alfa-with-fire-json-model`
    mvn clean install
    ```

## 2. Refresh the project's Fire models and re-sync ALFA models

- Open a terminal and run the following commands, where `master` is the Fire branch or tag to be used to import models into ALFA.
  - Windows
    - Run `update-models.cmd master`
  - Unix
    - Run `./update-models.sh master`

- Once the script has ended, local files in `src/main/resources/fire` and `src/main/alfa` would be updated, if there were changes in the JSON Schemas.
  Running `git status` or using a Git UI tool will show what has changed.

## 3. See what has changed

  - Run `mvn clean install -P gen-docs`, to generate documentation, which includes ALFA Change Analyzer report.
    
    The following snippet from `pom.xml` shows the `changeanalyzer` export being run between version v24.10 and current (contents 
    of `src/main/alfa`).

    ```
    <exportSetting>
        <exportType>changeanalyzer</exportType>
        <config>
            <startVersion>v24.10</startVersion>
            <baseDir>${basedir}</baseDir>
        </config>
    </exportSetting>
    ```

  - The report will be saved as `target/generated-sources/change-analyzer/report.html`.
