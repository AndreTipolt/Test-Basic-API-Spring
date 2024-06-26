FROM openjdk:17
FROM maven:3.9.4

WORKDIR /app

# COPY . /app

# RUN mvn clean package -DskipTests

COPY target/backend-0.0.1-SNAPSHOT.jar /app/spring-app.jar

ENTRYPOINT [ "java", "-jar", "spring-app.jar" ]