# Job-App-REST-API
# Job Application REST API

This is a REST API for managing job applications, built with Java and Spring Boot.

## Table of Contents
- Requirements
- Installation
- Running the Application
- API Endpoints
- Technologies Used
- Contributing
- License

## Requirements
- Java 17 or later
- Maven 3.6.3 or later
- MySQL 8.0 or later

## Installation
1. Clone the repository:
    ```bash
    git clone https://github.com/Divyansh123bn/Job-App-REST-API.git
    cd Job-App-REST-API
    ```

2. Configure the database:
    - Create a MySQL database named `job_app_db`.
    - Update the `src/main/resources/application.properties` file with your database credentials:
      ```properties
      spring.datasource.url=jdbc:mysql://localhost:3306/job_app_db
      spring.datasource.username=yourusername
      spring.datasource.password=yourpassword
      spring.jpa.hibernate.ddl-auto=update
      ```

3. Build the project:
    ```bash
    mvn clean install
    ```

## Running the Application
You can run the application using the Spring Boot Maven plugin:
```bash
mvn spring-boot:run

The application will start on http://localhost:8080.

API Endpoints
Job Applications
GET /api/jobPosts: Get all job applications
GET /api/jobPost/{id}: Get a job application by ID
POST /api/jobPost: Create a new job application
PUT /api/jobPost/{id}: Update a job application
DELETE /api/jobPost/{id}: Delete a job application
Example Request and Response
GET /api/jobPost

Spring Boot: Framework for building Java application
MySQL: Database
Maven: Build tool
Contributing
Contributions are welcome! Please fork the repository and create a pull request.

License
This project is licensed under the Apache License. See the LICENSE file for details.
