# Use Eclipse Temurin (the maintained replacement for openjdk)
FROM eclipse-temurin:17-jre-alpine AS runtime

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file from the host's build/libs directory into the container
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} app.jar

# Expose the port your Spring Boot application runs on (default is 8080)
EXPOSE 8080

# Define the command to run the application when the container starts
ENTRYPOINT ["java", "-jar", "/app/app.jar"]