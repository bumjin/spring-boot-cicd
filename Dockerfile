FROM openjdk:17-alpine
EXPOSE 8080
ADD target/spring-boot-docker.war spring-boot-docker.war
ENTRYPOINT ["java", "-jar", "/spring-boot-docker.war"]