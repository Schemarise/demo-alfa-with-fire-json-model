@echo off

if [%1]==[] goto usage

mkdir -P target\imported
cd target\imported

git clone https://github.com/SuadeLabs/fire.git
cd fire
git checkout %1

cd ..\..\..

REM Recreate the local copy of the models
rd /s /q src\main\resources\fire
mkdir -P src\main\resources\fire

move target\imported\fire\v1-dev src\main\resources\fire
move target\imported\fire\examples src\main\resources\fire
rd /s /q target\imported

REM Recreate the alfa files
rd /s /q src\main\alfa

mkdir -p src\main\alfa
mvn clean compile -P import-fire-schema

:usage
if [%1]==[] @echo Expect tag or branch name as argument. e.g. master
