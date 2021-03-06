# :sparkles: TESTNOW REST API TESTING EXAMPLE :sparkles:
Contains Rest API Testing features for Github rest API/Endpoints.

## Overview :eyes:

The REST API TESTING EXAMPLE uses the following components
* JUnit Parameterized Test Runner
* YAML
* Jersey Client

The parameterized runner will run a test multiple times given a bunch of parameters. This way we can write one test, specifiy our parameters in YAML and let JUnit do the hard work!


##Purpose :eyes:

Major purpose of this example automation is to understand how one can make maximum usage of [TestNow](https://www.opexsoftware.com/testNow.php) cross browser testing with minimum effort by following some best practices mentioned here. 
Few Best Practices are as follows:

1. How to test different rest API/Endpoints
2. How to create reports which helps TestNow to create consolidated reports for you.
3. and few more which you can relate to ... :)

## Application Under Test (AUT) :eyes:

__Rest API Testing Example__ are used to run rest API/Endpionts.

##How To Use This For Your Application :eyes:

__A walk through the folder structure__

1. "src/test/java/com" folder contain test classes which have all actoins and functions which will be used repeatedly.
2. "src/test/resources" contains sample YAML file which have some rest api endpoints.
3. "APITest.java" file is the entry point to test execution
4. "surefire-reports" folder is created inside the target folder once the test run is completed.

__Do's and Dont's__

1. Change the "RestAPIEndpoints.yaml" file as per the endpoints you want to test. The "RestAPIEndpoints.yaml" file is present in "src/test/resources" folder 
2. Do not delete "pom.xml" file as it acts as the main config file for java-maven based project

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
2. __mvn site__ -- This will recompile the code and execute the tests

## Reporting :eyes:
RestAPI testing automation reports are created in following 2 types of format

1. __XML__ : TEST-com.APITest.xml
2. __HTML__ : index.html

XML report will get generated inside the "target/surefire-reports" directory with above mentioned filename. HTML report will get generated inside the "target/site" directory. 

##Author :eyes:

* Name: __Rajashri Dalavi__
* Organization: __Opex Software__
* Email: __rajashri.dalavi@opexsoftware.com__

##Licence :eyes:
For Licence information, see [here](https://github.com/opexsw/testnowrestexample/blob/master/LICENSE)
