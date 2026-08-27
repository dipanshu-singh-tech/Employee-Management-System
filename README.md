<div align="center">

# 🧑‍💼 Employee Management System

### A RESTful Backend Application built with Spring Boot, JPA/Hibernate & MySQL

[![Java](https://img.shields.io/badge/Java-17%2B-orange?style=for-the-badge&logo=openjdk)](https://www.oracle.com/java/)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen?style=for-the-badge&logo=springboot)](https://spring.io/projects/spring-boot)
[![Hibernate](https://img.shields.io/badge/Hibernate-ORM-blue?style=for-the-badge&logo=hibernate)](https://hibernate.org/)
[![MySQL](https://img.shields.io/badge/MySQL-Database-4479A1?style=for-the-badge&logo=mysql)](https://www.mysql.com/)
[![Maven](https://img.shields.io/badge/Maven-Build-C71A36?style=for-the-badge&logo=apachemaven)](https://maven.apache.org/)
[![Postman](https://img.shields.io/badge/Tested%20with-Postman-FF6C37?style=for-the-badge&logo=postman)](https://www.postman.com/)

</div>

---

## 📖 About the Project

**Employee Management System** is a backend application that provides a clean set of **RESTful APIs** to manage employee data efficiently. It follows a **layered architecture** (Controller → Service → Repository → Entity) for better maintainability, testability, and scalability — making it a solid foundation for real-world HR/employee management applications.

---

## ✨ Features

- 🔄 **CRUD Operations** — Create, Read, Update, and Delete employee records via REST APIs
- 🗄️ **Spring Data JPA + Hibernate ORM** — for seamless object-relational mapping with MySQL
- 🏗️ **Layered Architecture** — clean separation of Controller, Service, Repository, and Model layers
- ✅ **API Testing** — all endpoints tested and verified using Postman
- 📦 **Maven** — for dependency management and project build
- ⚡ **Fast & Lightweight** — built on Spring Boot for rapid setup and deployment

---

## 🛠️ Tech Stack

| Layer            | Technology                  |
|-------------------|------------------------------|
| Language          | Java                        |
| Framework         | Spring Boot                 |
| Data Access       | Spring Data JPA / Hibernate |
| Database          | MySQL                       |
| Build Tool        | Maven                       |
| API Testing       | Postman                     |

---

## 🏗️ Architecture

```
Client (Postman / Frontend)
        │
        ▼
  Controller Layer   →  Handles HTTP requests & responses
        │
        ▼
   Service Layer      →  Business logic
        │
        ▼
 Repository Layer     →  Spring Data JPA interfaces
        │
        ▼
    MySQL Database    →  Persistent storage
```

---

## 📂 Project Structure

```
Employee-Management-System/
├── src/
│   ├── main/
│   │   ├── java/com/example/employeemanagement/
│   │   │   ├── controller/     # REST controllers
│   │   │   ├── service/        # Business logic
│   │   │   ├── repository/     # JPA repositories
│   │   │   ├── model/          # Entity classes
│   │   │   └── EmployeeManagementApplication.java
│   │   └── resources/
│   │       └── application.properties
│   └── test/
├── pom.xml
└── README.md
```
---

## 🚀 Getting Started

### Prerequisites

Make sure you have the following installed:

- ☕ Java 17+
- 📦 Maven
- 🐬 MySQL Server
- 🧰 An IDE (IntelliJ IDEA / Eclipse / VS Code)
- 📬 Postman (for API testing)

### Installation & Setup

**1. Clone the repository**

```bash
git clone https://github.com/dipanshu-singh-tech/Employee-Management-System.git
cd Employee-Management-System
```

**2. Configure the database**

Create a MySQL database:

```sql
CREATE DATABASE employee_management_db;
```

Update `src/main/resources/application.properties` with your MySQL credentials:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/employee_management_db
spring.datasource.username=your_mysql_username
spring.datasource.password=your_mysql_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
```

**3. Build the project**

```bash
mvn clean install
```

**4. Run the application**

```bash
mvn spring-boot:run
```

The application will start at:

```
http://localhost:8080
```

---

## 📡 API Endpoints

| Method   | Endpoint                | Description                     |
|----------|--------------------------|----------------------------------|
| `GET`    | `/api/employees`         | Get all employees               |
| `GET`    | `/api/employees/{id}`    | Get employee by ID               |
| `POST`   | `/api/employees`         | Add a new employee               |
| `PUT`    | `/api/employees/{id}`    | Update an existing employee      |
| `DELETE` | `/api/employees/{id}`    | Delete an employee               |


### Sample Request Body (POST/PUT)

```json
{
  "firstName": "Rahul",
  "lastName": "Sharma",
  "email": "rahul.sharma@example.com",
  "department": "Engineering",
  "salary": 55000
}
```

---

## 🧪 Testing

All APIs were tested using **Postman**. You can:

1. Import the endpoints listed above into a new Postman collection
2. Set the base URL as `http://localhost:8080`
3. Test each CRUD operation with sample JSON payloads

---

## 💡 Future Enhancements

- 🔐 JWT-based Authentication & Authorization
- 🔍 Search & Filter employees by department/role
- 📊 Pagination & Sorting for large datasets
- 📄 Swagger/OpenAPI documentation
- 🧪 Unit & Integration tests with JUnit + Mockito

---

## 🤝 Contributing

Contributions, issues, and feature requests are welcome!  
Feel free to check the [issues page](https://github.com/dipanshu-singh-tech/Employee-Management-System/issues) or submit a pull request.

---

## 📄 License

This project is open source and available for learning and portfolio purposes.

---

<div align="center">

### 👨‍💻 Author

**Dipanshu Singh**
[GitHub](https://github.com/dipanshu-singh-tech)

⭐ If you found this project helpful, don't forget to give it a star!

</div>
