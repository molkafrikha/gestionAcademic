FROM openjdk:17
EXPOSE 8089
ADD target/Candidate-1.0.0.jar Candidate-1.0.0.jar
ENTRYPOINT ["java", "-jar" , "Candidate-1.0.0.jar"]