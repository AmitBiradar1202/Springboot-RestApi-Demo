# Spring Boot Student REST API

This is my **first Spring Boot REST API**, built to manage student records.  
It demonstrates how to implement **CRUD operations** with Spring Boot, RESTful principles, and proper API layering.

---

## 🚀 Features
- **Get all students**
- **Get a student by ID**
- **Add a new student**
- **Update existing student**
- **Delete a student**
- Input validation with `@Valid`
- JSON-based requests and responses

---

## 🛠 Tech Stack
- **Java 17+**
- **Spring Boot 3+**
- **Spring Web**
- **Spring Data JPA**
- **Jakarta Validation API**
- **H2 Database** (can be switched to PostgresSql)
- **Maven**

---

## 📌 API Endpoints

| Method | Endpoint                      | Description             | Request Body Example |
|--------|-------------------------------|-------------------------|----------------------|
| GET    | `/api/students`               | Get all students        | - |
| GET    | `/api/students/{id}`          | Get a student by ID     | - |
| POST   | `/api/students`               | Add a new student       | ```json { "name": "Amit B", "age": 21, "email": "amit@example.com" } ``` |
| PUT    | `/api/students/{id}`          | Update a student        | ```json { "name": "Biradar A", "age": 22, "email": "biradar@example.com" } ``` |
| DELETE | `/api/students/{id}`          | Delete a student by ID  | - |

---



