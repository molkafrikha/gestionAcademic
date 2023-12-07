FROM openjdk:17
EXPOSE 8089
ADD src/main/resources/application.properties application.properties
ENV EUREKA_CLIENT_SERVICEURL_DEFAULTZONE=http://eurekaServer:8761/eureka/
ADD target/Candidate-1.0.0.jar Candidate-1.0.0.jar
ENTRYPOINT ["java", "-jar" , "Candidate-1.0.0.jar"]