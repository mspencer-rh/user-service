# Build the application first using Maven
FROM maven:3.8-openjdk-11 as build
WORKDIR .
COPY . .
RUN mvn install

# Then build into container
FROM openjdk:11
COPY target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]