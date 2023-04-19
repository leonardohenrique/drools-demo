# Spring Boot Drools Example

This is a simple example of how to integrate Drools rules engine with a Spring Boot application. 
The example demonstrates how to define business rules using Drools, how to configure a KieSession to execute the rules, and how to use the KieSession in a Spring Boot controller to process business logic.

## Getting Started

### Prerequisites

To run this application, you'll need to have the following installed on your machine:

- Java 8 or higher
- Maven 3 or higher

### Installing

To install the application, follow these steps:

1. Clone this repository to your local machine.
2. Navigate to the root directory of the project.
3. Run `mvn clean install` to build the project and run the tests.

### Running the Application

To run the application, follow these steps:

1. Navigate to the root directory of the project.
2. Run `mvn spring-boot:run` to start the application.

The application should now be running at `http://localhost:8080`.

### Testing the Application

To test the application, you can use the following endpoints:

- `POST /orders`: This endpoint accepts an `Order` object as JSON in the request body, applies the Drools rules to the order, and returns the modified `Order` object as JSON in the response body.

Here's an example of how to test the `POST /orders` endpoint using `curl`:

```bash
$ curl -X POST \
       -H "Content-Type: application/json" \
       -d '{"total": 150}' \
       http://localhost:8080/orders
```
       
This should return a JSON response that looks something like this:

```json
{
  "total": 150.0,
  "discount": 0.1
}
```


