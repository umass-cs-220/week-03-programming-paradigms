mkdir -p bin
rm -rf bin/*
fsc -d bin src/main/scala/cs220/db/*.scala
fsc -cp bin -d bin src/main/scala/cs220/*.scala
