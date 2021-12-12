# Build the application first using Maven
FROM maven:3.8-openjdk-11 as build
COPY src /home/app/src
COPY pom.xml /home/app/pom.xml
RUN mvn -f /home/app/src/pom.xml install

# Then build into container
FROM openjdk:11
COPY target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]