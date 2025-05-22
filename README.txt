📄 Description – Exercise Statement

The goal of this exercise is to develop a Spring Boot REST API that manages a `Fruit` entity with the following fields:

- `int id`
- `String name`
- `int quantityKg`

The API follows the MVC pattern and persists data using **Spring Data JPA** with an **H2 in-memory database**. It includes a global exception handler and uses `ResponseEntity` to return proper HTTP status codes and messages.

---

## 💻 Technologies Used

- Java 21
- Spring Boot 3.4.5
- Spring Data JPA
- Spring Web
- Spring Boot DevTools
- H2 Database
- Maven
- Visual Studio Code

---

## 📋 Requirements

- Java JDK 17 or higher (recommended: Java 21)
- Maven installed and available in system PATH
- Port 8080 must be available
- Internet connection for dependency resolution

---

## 🛠️ Installation

1. Clone or download the repository.
2. Open the project in **Visual Studio Code**.
3. Verify that Maven works by running:

```bash
mvn -v
