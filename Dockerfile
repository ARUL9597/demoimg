FROM openjdk:11
EXPOSE 8080
ADD ./target/testdocker.jar /testdocker.jar
CMD ["java","-jar","/testdocker.jar]