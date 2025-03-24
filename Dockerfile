# Use a base image with OpenJDK
FROM openjdk:17-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the Maven build file
COPY target/motivator-backend-0.0.1-SNAPSHOT.jar motivator_backend_app.jar

# Expose the application's port
EXPOSE 8080

# Command to run the application
CMD ["java", "-jar", "motivator_backend_app.jar"]
