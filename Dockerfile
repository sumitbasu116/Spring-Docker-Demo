FROM openjdk:17

WORKDIR /app

COPY ./target/Spring-Docker-Demo.jar /app/

EXPOSE 8282

CMD ["java", "-jar", "Spring-Docker-Demo.jar"]