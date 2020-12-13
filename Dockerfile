#FROM openjdk:8-jre-alpine3.9
FROM openjdk:8-jdk-alpine
# Refer to Maven build -> finalName
ARG JAR_FILE=/target/test.jar
WORKDIR /opt/app
#WORKDIR /opt/app

# cp target/spring-boot-web.jar /opt/app/app.jar
COPY ${JAR_FILE} test.jar
ENTRYPOINT ["java","-jar","test.jar"]
