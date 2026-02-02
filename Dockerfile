FROM eclipse-temurin:25
ARG JAR=build/libs/*.jar
COPY ${JAR} app.jar
EXPOSE 8081
ENTRYPOINT ["java","-jar","/app.jar","--server.port=8081"]
