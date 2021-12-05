# Seek
A language written in java (WIP no syntax checker)
# planned features
 * low size binaries:
Current binary size of hello world in different langs:  
Seek : 189 bytes  
java11 : 425 bytes
# currently planned workflow for compiler
 * load text file ☑️
 * check syntax
 * make pure binary ☑️
# currently planned workflow for runner
 * load text file ☑️
 * get commands that are run their ☑️
 * run them ☑️
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
