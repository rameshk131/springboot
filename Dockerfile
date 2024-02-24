# Define base image
FROM openjdk:11
LABEL maintainer="Ramesh Ranjan"
EXPOSE 8282
ADD /target/scim.jar scim.jar
ENTRYPOINT ["java", "-jar", "scim.jar"]