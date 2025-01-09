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


