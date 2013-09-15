cinglevue_coding_chalange
=========================

Setup instruction,
Activity is done by with maven. There for this activity should be build on maven installed environment.
	•	For take the project to eclipse IDE:
			o Open Command prompt (in windows) or Shell (in Linux)
			o Go to project folder 
			o Run ‘mvn eclipse:eclipse’ command
			o Import project to eclipse.
	•	Create a MySql DB called ‘cinglevue_db’ and run the SQL script in trunk/DB/Script folder.
	•	Change the DB connection details configured in src\main\webapp\WEB-INF\spring-beans\dbConfigContext.xml file as per the DB server details.
	•	To build the project 
			o Run ‘mvn clean install’ command.
	•	War file will be generate in target folder.

Technologies used
	•	Spring MVC
	•	Spring IoC
	•	Hibernate
	•	Bootstrap
	•	Jquery Data table
	•	Maven

Note: all the sorting filtering requests retrieve the data from backend database. There for this application is working fine with seriously large databases

