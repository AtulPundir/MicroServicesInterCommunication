# MicroServicesInterCommunication

Creating two Micro-services, App1 and App2.
Accessing API of App2 from App WebClients and API of App1 from App2 by using Feign Clients

# Dockerized App1
created Dockerfile
./gradlew clean build
./gradlew bootJar 
docker build -t app-fordocker1 .
docker run -p 8081:8081 app-fordocker1
