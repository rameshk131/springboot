# Define base image
FROM openjdk:11
LABEL maintainer="Ramesh Ranjan"
ADD target/scim.jar scim-docker-image.jar
ENTRYPOINT ["java", "-jar", "scim-docker-image.jar"]