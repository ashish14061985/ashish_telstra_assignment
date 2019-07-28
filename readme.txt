****************WELCOME***********************

This is BDD framework based on POM model and developed in Cucumber & integrated with selenium & test runner as Junit.
Maven is integrated to download and run all the dependecies and also supporting execution of the project locally and through command line. 
There are cucumber plugins used for parellel execution and generating parellel reports. Framework is enabled to run the specific feature files
directly through command line using cucumber.options commands.

This framework consists of three main scenarios as per the given assignment ( written in features ) folder.

feature files. Location : src/test/resources/features
   -Inavlid_Email_Testcase.feature
   -Product_Shopping_Testcase.feature
   -Register_Account_Testcase.feature

Step Defination files. location: src/test/java/step_definations

       - NewUserRegistration.java
       -ProductShoppingCartVerification.java

Page Object model pattern is followed. Files location : src/test/java/pagepbjects

       - LoginPage.java
       -RegisterAccountPage.java
       -ShoppingDressPage.java

support package is implemented. Location : src/test/java/support

ExecutionWrapper is implemented to abstract the Browser intitiation flow. All differernt types of browsers intitiation is controled
through these classes based on the user input.

Random email generator functions is written here to support the business requirements to generate random emails each time.

 

RunTest.Java - This is the Testrunner file controls the execution. Synch the Features & step defination together.
This is also used for customized reporting.

Output - This folder is deriving the reporting for the executed scenarios. Parellel execution reports are available here.

        

     	


