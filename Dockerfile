FROM openjdk:8-jre-alpine
ADD build/libs/posts-api-1.0.0.jar posts-api.jar
ENTRYPOINT ["java", "-jar","posts-api.jar"]

#FROM gradle:7.1-jdk8-alpine as builder
#USER root
#WORKDIR /builder
#ADD . /builder
#RUN gradle clean build -x test
#
#FROM openjdk:8-jre-alpine
#WORKDIR /app
#EXPOSE 8080
#COPY --from=builder /builder/build/libs/posts-api-1.0.0.jar posts-api.jar
#CMD ["java", "-jar", "posts-api.jar"]