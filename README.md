# Microservice Demo
This project demonstrates basic configuration of netflix eureka server for discover server,
cloud gateway to proxy underlying service

* Discover: Configuration of Standalone Discovery Server
* Gateway: It includes Spring Cloud Gateway to configure routing to underlying service
* Info: it includes `info` service to demonstrate how gateway routes the request coming to gateway to underlying service

## How to Run
* Start discover service then
* Start gateway and info service
* Then you will be able to access `localhost:8085:/api/info` which will internally route to `localhost:8089/api/info` and send you the response
