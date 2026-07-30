FROM eclipse-temurin:17-jre
WORKDIR /app
COPY target/*.war app.war
EXPOSE 8082
ENTRYPOINT ["java","-jar","app.war"]