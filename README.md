# springboot-actuator-monitoring

This Spring Boot application implements performance monitoring with Actuators. The application use Actuator's Info endpoint to display information about the application's health and status.

**Here are a few ways to test this Spring Boot application:**

- Run the application and test the endpoints using a web browser or a tool like Postman:
- Navigate to http://localhost:8000/hello and http://localhost:8000/users to see the responses from those endpoints
- Navigate to http://localhost:8000/my-actuator/info to see the Actuator's Info endpoint, using the custom base URL which should include the custom information contributed by the ActuatorInfoContributor() bean
- Navigate to http://localhost:8000/my-actuator/metrics to see metrics about your application such as the number of HTTP requests and the memory usage
- Navigate to http://localhost:8000/my-actuator/env to see information about the application's environment and system properties.
- Navigate to http://localhost:8000/my-actuator/health to see information about the overall health of the application.
