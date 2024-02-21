FROM openjdk:17
WORKDIR /app
COPY build/libs/axpe-interview-0.0.1-SNAPSHOT.jar axpe-interview.jar
CMD ["java", "-jar", "axpe-interview.jar"]
EXPOSE 8080
