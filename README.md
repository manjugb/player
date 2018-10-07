
TheoPlayerAutomation Framework

PageFactory:
------------
Selenium PageFactory. The PageFactory Class in Selenium is an extension to the Page Object design pattern. It is used to initialize the elements of the Page Object or instantiate the Page Objects itself.
The @FindBy annotation is used in Page Objects in Selenium tests to specify the object location strategy for a WebElement or a list of WebElements. Using the PageFactory, these WebElements are usually initialized when a Page Object is create

Getting Started
----------------

These instructions will get you a copy of the project up and running on your local machine for testing purposes. See deployment for notes on how to deploy the project on a live system.

Prerequisites
-------------
What things you need to install the software and how to install them
java and maven needs to be install before running this maven project
http://maven.apache.org/install.html
https://www.java.com/en/

Browsers Installed in local system:
----------------------------------
Chrome,Firefox,Microsoft Edge

Give examples

Installing
-----------
Command Line:
-------------
download this project unzip and save into local folder where maven and java installed
onwindow command line go to folder run 
mvn clean test

Ecliplse:
---------
Note:Make sure M2E Intalled in Eclipse,but this should come while installed eclipse
Download project from this repository
1.open Eclipse create workspace
2.File->Open->Import->Existing Maven Project and click on next 
3.successfully import
4.Right Click on Project->Run as->Maven Test

Jenkins:
--------

Before running this build to make sure java and maven should be installed under manage jenkins
or can be configured local system java and maven using manage jenkins->Global tool configuration

Steps Build:
------------
1.Click on New job
2.Write Desc and choose maven project(note:maven project is not availble, try install from manage jenkins -> Manage Plugins)
3.Go to build option enter root path with pom.xml
4.save and run build












