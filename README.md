
Microservices-Based E-commerce Application

Project Overview

This project is a Spring Boot Microservices application for an e-commerce platform. It includes:

Customer Service: Manages customer data.

Product Service: Manages product details.

Eureka Server: Service registry for microservices.

Swagger Documentation: API documentation using OpenAPI.

Technologies Used

Java (Spring Boot, Spring Web, Spring Data JPA)

Spring Cloud Eureka (Service Discovery)

MySQL (Database)

Swagger (API Documentation)

Maven (Build Tool)

---

Architecture Diagram

+-----------------------+

                       |     Eureka Server     |

                       |  (Service Registry)   |

                       +-----------+-----------+

                                   |

         +--------------------+    |    +--------------------+

         |   Customer Service |----+----|   Product Service  |

         |   (Port: 1010)     |         |   (Port: 5555)     |

         +--------------------+         +--------------------+

---

Project Setup

1. Clone the Repository

git clone https://github.com/your-repo/microservices-ecommerce.git

cd microservices-ecommerce

2. Run Eureka Server

Navigate to the eureka-server folder and run:

mvn spring-boot:run

Eureka will be available at: http://localhost:8761/

3. Run Microservices

Start each service separately:

Customer Service

cd customer-service

mvn spring-boot:run

Runs on: http://localhost:1010/

Product Service

cd product-service

mvn spring-boot:run

Runs on: http://localhost:5555/

4. Check Eureka Dashboard

Go to http://localhost:8761/ and verify if services are registered.

---

API Endpoints

Customer Service

GET /customers/{id} → Get customer details.

POST /customers → Add a new customer.

Product Service

GET /products/{id} → Get product details.

POST /products → Add a new product.

Swagger Documentation

Customer Service: http://localhost:1010/swagger-ui.html

Product Service: http://localhost:5555/swagger-ui.html

---

Troubleshooting

1. Eureka shows "No instances available"

Ensure the Eureka server is running before starting services.

Check if eureka.client.service-url.defaultZone is correctly set in application.properties of each service.

2. Database Connection Issues

Ensure MySQL is running and credentials match in application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/customer_db

spring.datasource.username=root

spring.datasource.password=your_password

3. White Label Error Page

Check logs for errors.

Ensure endpoints are correctly defined in controllers.

---

Contributors

Your Name

---
