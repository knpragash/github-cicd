FROM openjdk:17-jdk-slim
EXPOSE 9090
ADD target/docker-jenkins-integration.jar docker-jenkins-integration.jar
ENTRYPOINT ["java", "-jar", "/docker-jenkins-integration.jar"]