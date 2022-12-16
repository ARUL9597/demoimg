FROM tomcat:9.0.69
EXPOSE 8080
RUN rm -rf /usr/local/tomcat/webapps/*
COPY ./target/testdocker.war /usr/local/tomcat/webapps/ROOT.war
RUN chmod 0444 /usr/local/tomcat/webapps/ROOT.war
CMD ["catalina.sh","run"]
