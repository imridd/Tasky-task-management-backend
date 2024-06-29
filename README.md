# Tasky

   Tasky (Task Management Backend) is a robust Spring Boot application designed to facilitate efficient task management operations with MySQL integration.
   
# Table of Contents

1. [Overview](#overview)
2. [Features](#features)
3. [Technologies](#technologies)
4. [Setup Instructions](#setup-instructions)
5. [API Endpoints](#api-endpoints)
6. [Usage Examples](#usage-examples)
7. [Contributing](#contributing)
8. [License](#license)
# Overview
   - Tasky Task Management Backend provides a RESTful API backend for managing tasks, supporting essential CRUD operations (Create, Read, Update, Delete) via dedicated endpoints. 
   - It leverages Spring Boot for robustness and MySQL for persistent data storage.
   
# Features

- **CRUD Operations:** Efficient API endpoints for creating, reading, updating, and deleting tasks.
- **Secure Data Handling:** Integrates with MySQL for reliable data storage and retrieval.
- **Scalable Architecture:** Built on Spring Boot to support scalability and maintainability of backend services.
- **Flexible Integration:** Easily integrates with frontend or other applications via RESTful APIs.

# Technologies

 - **Java:** Core programming language
 - **Spring Boot:** Backend framework for rapid application development
 - **MySQL:** Relational database management system
 - **RESTful API:** Standard architectural style for developing web services
 - **Maven:** Dependency management and build automation
   
# Setup Instructions

  -  **Clone Repository:** git clone https://github.com/imridd/Tasky-task-management-backend.git
  -  **Navigate to Project:** cd Tasky-task-management-backend
  -  **Build Project:** mvn clean install
  -  **Run Application:** java -jar target/tasky-backend.jar
  -  **Access API:** Visit http://localhost:8080/tasky/ in RequestBin for API documentation and testing.

# API Endpoints
  Use tools like Postman or Request Bin to test CRUD APIs:
  - **Create Task:** POST http://localhost:8080/tasky/addtask
  - **Read Task by id:** GET http://localhost:8080/tasky/gettask/{taskid}
  - **Read all Tasks:** GET http://localhost:8080/tasky/gettasks
  - **Update Task:** PUT http://localhost:8080/tasky/updatetask/{taskid}
  - **Delete Task**: DELETE http://localhost:8080/tasky/deletetask/{taskid}

# Usage Example
   # Create a new task
    curl -X POST http://localhost:8080/tasky/addtask
    -H "Content-Type: application/json" \
    -d '{
     "description": "Complete project proposal",
     "taskdue": "2024-07-10",
     "taskstatus": "Pending"
    }'

  # Update an existing task
    curl -X PUT http://localhost:8080/tasky/updatetask/1
    -H "Content-Type: application/json" \
    -d '{
    "description": "Review code changes",
    "taskdue": "2024-07-15",
    "status": "In Progress"
    }'

# Contributing
Contributions are welcome! Please fork this repository and submit pull requests to propose improvements or fixes.

# License
This project is licensed under the MIT License - see the LICENSE file for details.


