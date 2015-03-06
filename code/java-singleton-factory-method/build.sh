mkdir -p bin
rm -rf bin/*
javac -d bin src/main/java/cs220/db/*.java
javac -cp bin -d bin src/main/java/cs220/*.java
