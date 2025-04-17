# Web Services with Spring Boot, JPA, and Hibernate

## Overview

This project is a backend application developed in Java using Spring Boot, JPA, and Hibernate. It serves as a foundational template for building RESTful web services, focusing on the implementation of CRUD (Create, Read, Update, Delete) operations and the management of entity relationships.

## Features

- **Entity Modeling**: Defines core entities such as Users, Orders, Products, and Categories, establishing clear relationships between them.
- **Layered Architecture**: Implements a structured approach with distinct layers:
  - **Entities**: Represent the domain models.
  - **Repositories**: Handle data access using Spring Data JPA.
  - **Services**: Contain business logic.
  - **Controllers**: Expose RESTful endpoints.
- **Exception Handling**: Provides a global exception handler to manage and return meaningful error responses.
- **Database Integration**: Configured to work with H2 for testing and PostgreSQL for development and production environments.
- **Testing**: Includes test cases using Postman to validate API endpoints.

## Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- Hibernate
- Maven
- H2 Database (for testing)
- PostgreSQL (for development and production)

## Getting Started

### Prerequisites

- Java 11 or higher
- Maven 3.6 or higher
- PostgreSQL (if not using H2)

### Installation

1. **Clone the repository**:
   ```bash
   git clone https://github.com/pro-gabrielteixeira/web-Spring-Boot-JPA-Hibernate.git
   cd web-Spring-Boot-JPA-Hibernate

## Architecture

Below are visual aids that help understand the structure and design of the project.

### 1. Domain Model

This diagram illustrates the main entities (`User`, `Order`, `Product`, `Category`) and their relationships. It helps visualize how the data model is organized.

![Domain Model](https://github.com/user-attachments/assets/75c37288-3091-4ed7-aa34-89b43d9767a0)

---

### 2. Domain Instance Example

An instance of the domain model showing real or example data in use. Useful for understanding how entities relate in practice — e.g., a `User` placing an `Order` with several `Products`.

![Domain Instance](https://github.com/user-attachments/assets/dfb2250c-5b1c-4735-8cd6-46964cc30dfe)

---

### 3. Logical Layers

This diagram represents the **logical architecture** of the application. It highlights the separation of concerns between Controllers, Services, Repositories, and Entities — a standard practice in clean, maintainable Spring Boot apps.

![Logical Layers](https://github.com/user-attachments/assets/34d10ab6-48c4-40c9-807f-da74f909b28f)


