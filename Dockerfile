FROM java:8-jdk-alpine
RUN ["ls"]
ADD ./target/time-0.0.1-SNAPSHOT.jar time-0.0.1-SNAPSHOT.jar
EXPOSE 8083
ENTRYPOINT ["java", "-jar", "time-0.0.1-SNAPSHOT.jar"]