# REST & microservices - in a nutshell

REST microservices with Spring Boot.\
Spring Boot Application generation tool, used for project structure:\
<https://start.spring.io/>

## Prerequisites
1. At least Java 8 JDK installed on machine.
2. Maven installed on machine
3. Java Text Editor (IDE):
[Eclipse](https://www.eclipse.org/downloads/)
or
[IntelliJ Idea](https://www.jetbrains.com/idea/download/)

## Installation

Clone repository locally (easy to do with GitHub Desktop application).
In order to run the projects execute:
```bash
mvn spring-boot:run
```
in module folder (where the pom.xml file is located).
Or run application class from Eclipse/IntelliJ

## Swagger URL's
- Pokemon Catalog Service:\
http://localhost:8083/swagger-ui.html\
http://localhost:8083/swagger-ui.html

- Pokemon Browse Service:\
http://localhost:8081/v2/api-docs\
http://localhost:8081/swagger-ui.html

- Pokemon Details Service:\
http://localhost:8082/v2/api-docs\
http://localhost:8082/swagger-ui.html

## Useful links
- HTTP Methdos: <https://restfulapi.net/http-methods/>
- Swagger annotations:\
<http://docs.swagger.io/swagger-core/v1.5.0/apidocs/index.html>
- Swagger annotations examples:\
<https://github.com/swagger-api/swagger-core/wiki/Annotations>
- Java Functional interfaces:\
<https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html>
- Spring:\
Nice examples:<http://zetcode.com/springboot/component/>
