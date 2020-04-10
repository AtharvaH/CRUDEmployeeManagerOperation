Employee & Manager CRUD operations using Angular and Spring Boot

In this project the CRUD operations are carried out with angular as frontend and Java spring boot as server side.

Prerequisites:-
	Java 1.8 installed
	Spring Tool Suite (STS) IDE
	MYSQL
	Angular.

Steps to run the project,

1.] Run the .sql scripts in the mysql command line client or mysql workbench to create the database and the required tables.

2.] a) For angular to run, goto the 'FrontEnd->crudclient' folder and open cmd terminal.
    b) Run the command ng serve -o to start angular envoirment.
    c) An enviorment should be running on http://localhost:4200.
    d) Strictly do not close or quit the cmd.

3.] To run the java server, follow the steps given below:-
    a) Open an IDE (STS).
    b) Create a Maven Project then right click on project ( Import -> General -> File System -> Location of 'CRUDDemo' folder
	( CRUDDemo is the folder where server side code sits )
    c) Right Click on the root folder in the IDE and Select Maven -> Update Project
	( to update the project to local machine settings and repositories. If required update by selecting the 
		Force update to Snapshots\Releases ) 
    d) After updating the project, Open the 'CrudDemoApplication', Right click in the editor and Select Run As -> Spring Boot Application
    e) The server shall be running on the http://localhost:8090/

Note:-
1.] Update Functionality not working
2.] Few Validations are missing