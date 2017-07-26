# SpringBootTomcatTestEnv
Tool for testing a dockerized Tomcat's environmental variable settings using a Spring Boot application.

## Running
To run this tool use 

```
docker-compose up -d
```

to create the containers then

```
mvn clean install
```

to build the application and finaly deploy the .war file from the target to the mounted webapp directories.

A sample output of a run is found in the debug.txt file.
