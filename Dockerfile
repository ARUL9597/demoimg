FROM openjdk:11-alpine
EXPOSE 8080
ADD ./target/testdocker.jar /testdocker.jar
CMD ["java","-jar","/testdocker.jar]