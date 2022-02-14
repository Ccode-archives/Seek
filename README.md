# Seek
A language written in java for educational purposes.
> develeopment is over. This project was just for the fun of it.  also it does not compile to binary.
# Features
 * low size binaries:
Current binary size of hello world in different langs:  
Seek : 189 bytes  
java11 : 425 bytes
 * fast execution
 * Simple compiled files
# todo
 * Built in decompiler
# How to build
Use java 11 for builds.  
```
chmod +x gradlew
./gradlew build
```
Output jar at ./build/libs.
# Running
```
java -jar lang.jar <flags>
```
Running files
```
java -jar lang.jar run <file>
```
Building files
```
java -jar lang -jar comp <file to compile> <destination of binary>
```
# syntax
## print
```
print <what to print>
```
## pass
just the comment start word.
