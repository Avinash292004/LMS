A comprehensive Learning Management System built with Java that allows students and instructors to manage courses and learning materials.

Project Structure
LMS_Starter_Project/
├── model/         # Entity classes
│   ├── User.java
│   ├── Student.java
│   ├── Instructor.java
│   └── Course.java
├── dao/           # Data Access Objects
│   ├── UserDAO.java
│   └── CourseDAO.java
├── ui/            # User Interface components
│   ├── LoginForm.java
│   └── Dashboard.java
├── util/          # Utility classes
│   └── DBConnection.java
├── resources/     # Database and resource files
│   └── lms.sql
└── README.md
Features
User authentication and authorization
Course management
Student and instructor management
Dashboard for monitoring activities
Database connectivity
Prerequisites
Java Development Kit (JDK) 11 or higher
MySQL Database Server
Integrated Development Environment (IDE) like IntelliJ IDEA or Eclipse
Setup Instructions
Prerequisites
Java Development Kit (JDK) 11 or higher
Maven 3.6.0 or higher
MySQL Database Server
Integrated Development Environment (IDE) like IntelliJ IDEA or Eclipse
1. Database Setup
Install MySQL Server if not already installed
Create a new database named 'lms':
CREATE DATABASE lms;
Run the database schema:
USE lms;
SOURCE resources/lms.sql;
2. Project Setup
Install Maven if not already installed:

Download from: https://maven.apache.org/download.cgi
Add Maven's bin directory to your system PATH
Clone or download this repository

Open a terminal in the project directory and run:

mvn clean install
3. Running the Application
Using Maven:

Open a terminal in the project directory
Run: mvn exec:java -Dexec.mainClass="main.Main"
Using the Build Script:

Double-click build.bat in Windows
The script will:
Clean and compile the project
Package it into a JAR
Run the application
Using an IDE:

Import the project as a Maven project
Right-click on Main.java
Select "Run As" -> "Java Application"
4. Default Login Credentials
Username: admin
Password: password
Note: These are default credentials for development. Please change them in production!

Database Structure
The database schema is defined in resources/lms.sql
