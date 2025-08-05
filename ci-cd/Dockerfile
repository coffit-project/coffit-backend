FROM openjdk:17
ARG JAR_FILE=build/libs/*jar
COPY ${JAR_FILE} coffit.jar
ENTRYPOINT ["java", "-jar", "/coffit.jar"]