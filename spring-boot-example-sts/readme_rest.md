Project Technologies : ---->
  1)Spring  DATA and JPA 
  2)Java7
  3)Maven
  4)MySql server
  5)Spring Boot

Import the project as a simple maven project and run the application as spring boot application

End point details with request object parameters:
 
  
  1)Add Employee : request object -->localhost:8090/restemployee/save
      {"employee_id":"2", "first_name":"krishna",  
        "last_name":"kumar"}  

  2)Get Employee :request object -->localhost:8090/restemployee/employee/2
       
       Response: {
                  "employee_id": 2,
                  "first_name": "krishna",
                  "last_name": "kumar"
                    }

  3)Delete Employee (id) : localhost:8090/restemployee/delete/1

    Response: {}

  List of All Employees : localhost:8090/restemployee/getlist
    response: [
    {
        "employee_id": 2,
        "first_name": "krishna",
        "last_name": "kumar"
    }
              ]
  
  4)Get count of Employee present: localhost:8090/restemployee/employeecount
    Response : The count is : 1

  5)Update Employee:localhost:8090/restemployee/update/2

    Request object :
     
     {
        "employee_id": 2,
        "first_name": "fayaz",
        "last_name": "krishn"
    }
     Response : The count is : 1
     
   6)swagger-ui:
    http://localhost:8090/swagger-ui.html 