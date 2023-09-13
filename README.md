# Skeleton - Java Spring Boot project

## Getting Started

Follow these instructions to get a copy of the project up and running on your local machine for development and testing purposes.

## Prerequisites

Make sure you have the following tools installed on your system:

- Java Development Kit (JDK) 17 or higher
- Maven
- Your favorite Integrated Development Environment (IDE) with Spring Boot support (e.g., IntelliJ IDEA, Eclipse)

## Project Structure

The project has a basic structure that you can expand upon as you develop your application. Here are some key directories and files:

- __src/main/java/com/yourcompany/yourproject__: Java source code goes here.
- __src/main/resources__: Configuration files, application properties, and static resources.
- __src/test__: Unit and integration tests.
- __pom.xml__: Maven project configuration file.

## Build and Run

1. Open the project in your chosen IDE.
2. Build the project using Maven:

```bash
mvn clean install
```

3. Run the application:

```bash
mvn spring-boot:run
```

The Spring Boot application will start, and you can access it in your web browser at ___http://localhost:8080___.

## Running Docker

#### Development
This runs Spring Boot project as development environment

```bash
docker-compose up -d --build --verbose
```

#### Production
This process compile and create a jar package to run as "production" environment

```bash
docker-compose -f docker-compose-prod.yml up -d --build --verbose
```
