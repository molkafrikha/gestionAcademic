FROM openjdk:17
EXPOSE 8089
ADD target/Candidate-0.0.1-SNAPSHOT.jar Candidate-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar" , "Candidate-0.0.1-SNAPSHOT.jar"]