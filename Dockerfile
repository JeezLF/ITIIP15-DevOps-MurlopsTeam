FROM tomcat:jdk8-adoptopenjdk-openj9
ADD retwisj/target/retwisj-0.1-SNAPSHOT.war /usr/local/tomcat/webapps/retwis.war
EXPOSE 8080
CMD ["catalina.sh","run"]

