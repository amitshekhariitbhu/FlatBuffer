# FlatBuffer Android Sample Application
This app shows how fast flat buffer works when we compare it with json.

# Know more about FlatBuffer (Why use FlatBuffer?)
[Why use FlatBuffer](https://medium.com/@amitshekhar/why-consider-flatbuffer-over-json-2e4aa8d4ed07#.s67hhn8lt)

### How to start with flatBuffer
```sh
$ git clone https://github.com/google/flatbuffers.git
```
```sh
$ cd flatbuffers
```
* Run the command on the basis of your platform
```sh
$ cmake -G "Unix Makefiles"
$ cmake -G "Visual Studio 10"
$ cmake -G "Xcode"
```
* now build for your platform as usual. This should result in a flatc executable
* Now create your schema file with extension .fbs. Guide to write a schema can be found [here](https://google.github.io/flatbuffers/flatbuffers_guide_writing_schema.html).And also have your sample json file.
```sh
$ ./flatc -j -b schema.fbs sample.json
```
* This will create few java file and one bin file. Java files are like model(POJO for flatBuffer) of your json.Place the java files in your application package and bin file in raw folder(bin file is only for testing as it is converted to byte that is to be passed to flatbuffer for testing).
* Now we have to get flatbuffer jar file.
```sh
$ cd flatbuffers
$ cd java
$ mvn install
This will download all the dependencies.
$ cd target
```
* Here we will get the flatbuffers-java-1.3.0-SNAPSHOT.jar file that you have to put it in your libs folder of android project.
* For rest you can see my sample project.

## Major steps:
* Prepare your schema.fbs.
* Have a sample json.
* Build flatBuffer google project to generate your java files to be used in main application.
* Generate java files.