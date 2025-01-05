Demo ALFA Fire (JSON Schema) Model integration Project
======================================================

This project shows how easy it is to:
- import a JSON Schema data model into ALFA
- extend with validations beyond what Fire/JSON Schema offers
- perform transformation other models

Steps to import the current version of Fire
-------------------------------------------

1. Open a terminal and run the following commands

**Windows instructions:**
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
mkdir -p model/imported
cd model/imported
git clone https://github.com/SuadeLabs/fire.git
mv fire/v1-dev fire-models
rm -rf fire
cd ../..
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
