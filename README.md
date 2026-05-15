# Employee Management System

## Project Description
This is a Spring Boot based Employee Management System developed using Java, Spring Boot, Spring Security, JPA/Hibernate, and MySQL.  
The application provides secure JWT-based authentication and authorization along with CRUD operations for employee management.

## Features
- User Registration and Login
- JWT Authentication and Authorization
- BCrypt Password Encryption
- Employee CRUD Operations
- Pagination and Sorting
- Secure REST APIs
- MySQL Database Integration

## Technologies Used
- Java 17
- Spring Boot
- Spring Security
- Spring Data JPA / Hibernate
- MySQL
- JWT (JSON Web Token)
- Maven

## API Endpoints

### Authentication APIs
- POST `/register`
- POST `/login`

### Employee APIs
- GET `/employees`
- GET `/employees/{id}`
- POST `/employees`
- PUT `/employees/{id}`
- DELETE `/employees/{id}`

### Pagination and Sorting
- GET `/employees/pagination?page=0&size=5&field=name`

## Security
- JWT Token Based Authentication
- Password Encryption using BCrypt

## Testing
- API testing performed using Postman
- Basic unit testing using JUnit 5

## Author
Saloni
