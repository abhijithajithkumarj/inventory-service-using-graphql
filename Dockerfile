FROM openjdk:17
WORKDIR /app
COPY ./target/inventory-service-using-graphql.jar /app
EXPOSE 8080
CMD ["java","-jar","course-service.jar"]