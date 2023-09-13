FROM maven:3.9.4
WORKDIR /app
COPY . /app

EXPOSE 8080

ENTRYPOINT ["mvn", "spring-boot:run", "-Dverbose=true -Dgib.enabled=false"]
