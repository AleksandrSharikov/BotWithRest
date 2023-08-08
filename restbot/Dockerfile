FROM openjdk:19-oracle
ARG JAR_FILE=target/*.jar
LABEL authors="Aleksandr.N.Sharikov@gmail.com"
RUN mkdir /opt/rest
COPY ${JAR_FILE} /opt/rest/rest_app.jar
ENTRYPOINT ["java","-jar","/opt/rest/rest_app.jar"]