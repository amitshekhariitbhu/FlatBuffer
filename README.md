# FlatBuffer Android Sample Application
This app shows how fast flat buffer works when we compare it with json.

## [Outcome School Blog](https://outcomeschool.com/blog) - High-quality content to learn Android concepts.

### FlatBuffers Vs JSON

<img src=https://raw.githubusercontent.com/amitshekhariitbhu/FlatBuffer/master/assets/flatbuffervsjson.png width=460 height=450 />

### FlatBuffer is too much faster than JSON.


## Try [Fast Android Networking Library](https://github.com/amitshekhariitbhu/Fast-Android-Networking) for easy and fast networking

## Another awesome library for debugging databases and shared preferences.
* [Android Debug Database](https://github.com/amitshekhariitbhu/Android-Debug-Database)


### How to start with flatBuffers
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
// This will download all the dependencies.
$ cd target
```
* Here you will get the flatbuffers-java-1.3.0-SNAPSHOT.jar file that you have to put it in your libs folder of android project.
* For rest you can see my sample project.

## Major steps:
* Prepare your schema.fbs.
* Have a sample json.
* Build flatBuffer google project to generate your java files to be used in main application.
* Generate java files.

### Find this project useful ? :heart:
* Support it by clicking the :star: button on the upper right of this page. :v:

You can connect with me on:

- [Twitter](https://twitter.com/amitiitbhu)
- [LinkedIn](https://www.linkedin.com/in/amit-shekhar-iitbhu)
- [GitHub](https://github.com/amitshekhariitbhu)
- [Facebook](https://www.facebook.com/amit.shekhar.iitbhu)

[**Read all of our blogs here.**](https://outcomeschool.com/blog)

### License
```
   Copyright (C) 2022 Amit Shekhar

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
```
