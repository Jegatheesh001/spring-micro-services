FROM openjdk:8
ADD target/eureka-server-0.0.1-SNAPSHOT.jar eureka-service.jar
EXPOSE 8761
ENTRYPOINT ["java", "-jar", "eureka-service.jar"]