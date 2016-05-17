# :sparkles: TESTNOW REST API TESTING EXAMPLE :sparkles:
Contains Rest API Testing features for Github rest API/Endpoints.

## Overview :eyes:

The REST API TESTING EXAMPLE uses the following components
* JUnit Parameterized Test Runner
* YAML
* Jersey Client

The parameterized runner will run a test multiple times given a bunch of parameters. This way we can write one test, specifiy our parameters in YAML and let JUnit do the hard work!


##Purpose :eyes:

Major purpose of this example automation is to understand how one can make maximum usage of [TestNow](https://opexsoftware/testnow) cross browser testing with minimum effort by following some best practices mentioned here. 
Few Best Practices are as follows:

1. How to test different rest API/Endpoints
2. How to create json and html reports which helps TestNow to create consolidated reports for you.
3. How to take failed scenario screenshots
4. and few more which you can relate to ... :)

## Application Under Test (AUT) :eyes:

__Rest API Testing Example__ are used to run rest API/Endpionts.

##How To Use This For Your Application :eyes:

__A walk through the folder structure__

1. src/test/java/com/example folder contain tset class which have all actoins and functions which repeatedly using
2. src/test/resources contains sample YAML file which have some github rest api endpoints.
3. APITest.java file is the entry point to test execution
4. Reports folder is created inside of target folder

__Do's and Dont's__

1. Change the RestAPIEndpoints.yaml files in src/test/resources folder as per the endpoints you want test.
2. Do not delete pom.xml file as it acts as the main config file for java-maven based project

## Requirements :eyes:

1. __Code__
  * TESTNOW Rest API Testing EXAMPLE code 
2. __Programming Language__
  * Java
3. __Dependencies__
  * All mentioned in pom.xml file, no additional dependency installation required

## Setup :eyes:

__git clone https://github.com/opexsw/testnowrestexample.git__

## Execution :eyes:

__Commmands__ 

1. __mvn clean__ -- This will clean the old compiled code
2. __mvn test__ -- This will recompile the code and execute the tests
3. __mvn clean test__ -- This will do 1 and 2 both

## Reporting :eyes:
Magento automation reports are created in following 2 types of format

1. __HTML__ : index.html
2. __JSON__ : index.json

Reports are created inside the target/reports directory with above mentioned filenames

##Author :eyes:

* Name: __Rajashri Dalavi__
* Organization: __Opex Software__
* Email: __rajashri.dalavi@opexsoftware.com__

##Licence :eyes:
For Licence information, see [here](https://github.com/opexsw/testnowrestexample/blob/master/LICENSE)
