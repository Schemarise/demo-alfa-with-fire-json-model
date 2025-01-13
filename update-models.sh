if [[ $# -eq 0 ]] ; then
    echo 'Expect tag or branch name as argument. e.g. master'
    exit 0
fi

mkdir -p target/imported
cd target/imported

git clone https://github.com/SuadeLabs/fire.git
cd fire
git checkout $1

cd ../../..

# Recreate the local copy of the models
rm -rf src/main/resources/fire/
mkdir -p src/main/resources/fire/

mv target/imported/fire/v1-dev src/main/resources/fire/
mv target/imported/fire/examples src/main/resources/fire/
rm -rf target/imported

# Recreate the alfa files
rm -rf src/main/alfa
mkdir -p src/main/alfa
mvn clean compile -P import-fire-schema
