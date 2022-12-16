FROM openjdk:12-alpine
EXPOSE 8080
ADD ./target/testdocker.jar /testdocker.jar
ENTRYPOINT ["java","-jar","/testdocker.jar"]