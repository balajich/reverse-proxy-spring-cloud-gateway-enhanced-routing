# Reverse proxy using Spring Cloud Gateway with enhanced routing
In this tutorial we are going to a run reverse proxy that is going to server requests on behalf of tomcat.
- Run reverse proxy (Spring Cloud Gateway) on 8080 port
- Run rest api (tomcat) on 9090 port
- Route requests to only healthy tomcats,  health check tomcat before routing requests.
# Source Code
    git clone https://github.com/balajich/reverse-proxy-spring-cloud-gateway-enhanced-routing.git
# Architecture
# Prerequisite
- JDK 1.8 or above
- Apache Maven 3.6.3 or above
# Clean and Build
    mvn clean install
# Run Gateway server
     java -jar .\gateway\target\gateway-0.0.1-SNAPSHOT.jar
- The above command runs Netty  server on port 8080
- All the requests that are received on 8080 is forwarded to tomcat server running on 9090
# Run api server
    java -jar .\restapi\target\restapi-0.0.1-SNAPSHOT.jar
# Using curl to test environment
Access rest api via gateway

    curl http://localhost:8080/

Access rest api directly.

    curl http://localhost:9090/

# Run api server on 9091 port
     java '-Dserver.port=9091' -jar .\restapi\target\restapi-0.0.1-SNAPSHOT.jar
# Assignment
- Enhance gateway to route requests to tomcat running on 9091
- Observe requests are served in round robin fashion by the two servers running on 9090 and 9091
- Enhance gateway application to route requests to only healthy tomcats
# Solutions
Please refer next tutorial

