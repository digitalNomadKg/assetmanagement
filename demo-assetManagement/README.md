# Asset Management API 1.0.0

The asset management API supports the simple , internal management system.
An asset management server the basic functionality of API includes creating an employee with specific fields, 
updating the employee information, getting employee information, and deleting employee from the database. 
API provides only a REST interface. There is no user interface. 
The service can be used and tested via API testing tools (e.g., SoapUI, Postman). 
Open API requirements available;

_Technical choices_

    1) Spring Boot version 2.5.6
    2) Spring Data JPA
    3) Maven
    4) Lombok
    5) PostGresSql
    6) Swagger version 2.9.2
    7) API testing tool Postman
    8) Docker
    
_Deployment instructions:_

    1) PostGresSql database:(localhost:5432/assetmanagement)
      - login: postgres
      - password: root123
    
    2) No authentification
    3) API provides only a REST interface, no user interface
    4) Application is running on localhost:8081 
    5) Swagger UI : http://localhost:8081/swagger-ui.html
    6) Docker image run: docker run -p 8081:8081 demo-asset-management-docker

_API offers the following resource collections:_

    Employee - represents the physical entity;
 
_Manage Employees:_

    Create an employee
    Get all employees
    Get employee by id
    Update an employee by id
    Delete employee by id
   
_Things learned:_

    1) Increased understanding of microservice design/ design patterns
    2) Spring boot dockerization first experiense, creating Jar files.
    3) Creating open API documentation via swagger based on provided task requirement.
    4) Swagger code design structure, gained knowledge about swagger possibilities.
    5) Increased knowledge in usage postman. 
    6) Increased knowledge of how to start software development project.
    7) Learned how to design and complete project README file.
    8) Improved undersdanting of HTTP statuses, Httpresponces.
    9) Improved debuggind skill, searching for appropriate information and choosing right solution. 
       
_Things to be done:_  

    2) Update error message

