Demo ALFA Fire (JSON Schema) Model Integration Project
======================================================

This project shows how easy it is to:
- Write type-safe Java code against JSON Schema imported into ALFA
- Validate and create clean JSON conforming to the model
- Import newer versions of JSON Schema to update ALFA models
- Quickly see model changes between versions 

Suade Fire (github.com/SuadeLabs/fire) is used as the example JSON Schema model.  

Steps refresh to version of ALFA models based on the current Fire models
------------------------------------------------------------------------

1. Open a terminal and run the following commands

**Windows instructions:** 
REVIEW
```
mkdir -P model\imported
cd model\imported
git clone https://github.com/SuadeLabs/fire.git
rmdir /s /q fire\.git
alfa -i jsonschema -o fire-in-alfa -s namespace=firemodel fire\v1-dev
cd ..\..
```

**Linux/Mac instructions:**
```
mkdir -p target/imported
cd target/imported
git clone https://github.com/SuadeLabs/fire.git
#can be a tag instead of master
cd fire
git checkout tags/v24.10
cd ../../..
rm -rf src/main/resources/fire/
mkdir -p src/main/resources/fire/
mv target/imported/fire/v1-dev src/main/resources/fire/
mv target/imported/fire/examples src/main/resources/fire/
rm -rf target/imported
```

2. Browse from VSCode into model/fire-in-alfa

3. You can open ALFA Studio and browse the imported types

4. Run the following command to perform DQ on the bbo_loans.json Fire data file. The DQ results are written to the 
   `generated` directory.
```
alfa --dq --datafiles model/imported/fire/examples/bbl_loans.json --types firemodel.example -o generated -s use-cached-classes=true ../alfa-suade-fire-model/
```

   NOTE: The 1st run will take 30-40 seconds longer.

5. To simulate an error, edit model/imported/fire/examples/bbl_loans.json and change the currency code. Re-run DQ and 
   check validaton results.

6. Notice there is a file /model/validations/loan-validation.alfa. This is a custom validation over the `loan` model 
   to validate start_date is before end_date. Try editing the bbl_loans.json to make start_date afte end_date and re-run validation.

7. Generate model HTML documentation using the command below, to have documentation generated into a `target/generated-docs` directory.
```
mvn -s .alfa/settings.xml install -P genhtml
zip -r target/generated-docs.zip generated-docs/
```


#### Refresh cache of dependencies:
```
mvn -Dmdep.useRepositoryLayout=true -s .alfa/settings.xml  clean dependency:copy-dependencies -U
```
Commit the updated zip files.

#### Checkout specific commit/branch

```
git clone https://github.com/SuadeLabs/fire.git
cd fire
Q1:
git checkout d253f5a .
Q2:
git checkout 6e9ad18 .
Q3:
git checkout c71c108 .
Q4:
git checkout fd6e662 .
```
