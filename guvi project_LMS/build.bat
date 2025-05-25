@echo off

:: Set up Maven if not already installed
set MAVEN_HOME=C:\Program Files\Apache\maven
set PATH=%MAVEN_HOME%\bin;%PATH%

echo Building LMS Project...

:: Clean and compile the project
mvn clean compile

:: Package the project into a JAR file
mvn package

:: Run the application
echo Starting LMS Application...
mvn exec:java -Dexec.mainClass="main.Main"

pause
