# FlatBuffer Android Sample Application
This app shows how fast flat buffer works when we compare it with json.

### FlatBuffers Vs JSON

[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-FlatBuffer%20Android%20Sample%20Application-blue.svg?style=flat)](http://android-arsenal.com/details/3/3962)
[![License](https://img.shields.io/badge/license-Apache%202.0-blue.svg)](https://github.com/amitshekhariitbhu/FlatBuffer/blob/master/LICENSE)

<img src=https://raw.githubusercontent.com/amitshekhariitbhu/FlatBuffer/master/assets/flatbuffervsjson.png width=460 height=450 />

### FlatBuffer is too much faster than JSON.

## Try [Fast Android Networking Library](https://github.com/amitshekhariitbhu/Fast-Android-Networking) for easy and fast networking
* [Fast Android Networking Library](https://github.com/amitshekhariitbhu/Fast-Android-Networking)
* [Why Fast Android Networking Library?](https://medium.freecodecamp.com/simple-and-fast-android-networking-19ed860d1455#.y590rbxrf)

## Know more about FlatBuffers (Why use FlatBuffers?)
[Why use FlatBuffers](https://medium.com/@amitshekhar/why-consider-flatbuffer-over-json-2e4aa8d4ed07#.s67hhn8lt)

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
This will download all the dependencies.
$ cd target
```
* Here you will get the flatbuffers-java-1.3.0-SNAPSHOT.jar file that you have to put it in your libs folder of android project.
* For rest you can see my sample project.

## Major steps:
* Prepare your schema.fbs.
* Have a sample json.
* Build flatBuffer google project to generate your java files to be used in main application.
* Generate java files.

### Show some :heart:
* Be sure to click the "<b>Star</b>" button in the upper right of this page. :smile:

[![GitHub stars](https://img.shields.io/github/stars/amitshekhariitbhu/FlatBuffer.svg?style=social&label=Star)](https://github.com/amitshekhariitbhu/FlatBuffer) [![GitHub forks](https://img.shields.io/github/forks/amitshekhariitbhu/FlatBuffer.svg?style=social&label=Fork)](https://github.com/amitshekhariitbhu/FlatBuffer/fork)  [![GitHub followers](https://img.shields.io/github/followers/amitshekhariitbhu.svg?style=social&label=Follow)](https://github.com/amitshekhariitbhu)  
[![Twitter Follow](https://img.shields.io/twitter/follow/amitiitbhu.svg?style=social)](https://twitter.com/amitiitbhu)

### Contact - Let's become friend
- [Github](https://github.com/amitshekhariitbhu)
- [Medium](https://medium.com/@amitshekhar)
- [Facebook](https://www.facebook.com/amit.shekhar.iitbhu)

### License
```
   Copyright (C) 2016 Amit Shekhar

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