FROM eclipse-temurin:22-jdk

WORKDIR /app

COPY ./src /app/src
COPY ./pom.xml /app/pom.xml  

RUN apt-get update && apt-get install -y maven \
    && mvn clean package -f /app/pom.xml -DskipTests

EXPOSE 8080

CMD ["sh", "-c", "java -jar target/*.jar"]
# CMD ["tail", "-f", "/dev/null"]

