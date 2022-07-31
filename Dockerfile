
# the first stage of our build will use a maven 3.6.1 parent image 
FROM maven:3.8.6-openjdk-8 as maven_build 

# copy the pom and src code to the container 
COPY ./ ./  

# package our application code 
RUN mvn clean package 

# the second stage of our build will use open jdk 8 on alpine 3.9 
FROM openjdk:8-jre-alpine3.9  as multi-line-app

# copy only the artifacts we need from the first stage and discard the rest 

COPY --from=maven_build /target/multiline-0.0.1-SNAPSHOT.jar /multiline.jar 

# set the startup command to execute the jar 
CMD ["java", "-jar", "/multiline.jar"]