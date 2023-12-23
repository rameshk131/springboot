# Define base image
FROM openjdk:11
LABEL maintainer="Ramesh Ranjan"
EXPOSE 8282
ADD target/scim-1.jar scim-docker-image.jar
ENTRYPOINT ["java", "-jar", "scim-docker-image.jar"]