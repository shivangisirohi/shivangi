# Use the official OpenJDK image as a parent image
FROM openjdk:latest

# Set the working directory to /app
WORKDIR /app

# Copy the current directory contents into the container at /app
COPY .   /app

# Compile the Java code
RUN javac LargestNumberDivisibleBy10And13.java

# Run the program when the container starts
CMD ["java", "LargestNumberDivisibleBy10And13"]