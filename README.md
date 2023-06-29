Project Name
**Spring-Boot-Crud-Api**

Description
This project implements a CRUD (Create, Read, Update, Delete) API using Java, Spring-Boot, and Gradle. It provides endpoints to manage items in a menu.

**Features**
Retrieve a list of items in the menu
Retrieve a single item by ID
Create a new item
Update an existing item
Delete an item by ID

**Technologies Used**
Java
Spring Boot
Gradle

**Setup and Installation**
Clone the repository to your local machine.
Please make sure you have Java and Gradle installed.
Build the project using the following command:
bash
Copy code
./gradlew build
Run the application using the following command:
bash
Copy code
./gradlew bootRun

The API will be accessible at http://localhost:8080/api/menu/items.//You can change the ort number in the application.properties file
API Endpoints
GET /api/menu/items: Retrieve a list of items in the menu.
GET /api/menu/items/{id}: Retrieve a single item by ID.
POST /api/menu/items: Create a new item.
PUT /api/menu/items/{id}: Update an existing item.
DELETE /api/menu/items/{id}: Delete an item by ID.
Usage
You can use a tool like Postman to interact with the API endpoints mentioned above. Set the appropriate request method, URL, and request body (if required) to perform the desired CRUD operations.

Contributions
Contributions to this project are welcome. If you find any issues or would like to suggest improvements, please create a new issue or submit a pull request.

Contact
For any questions or inquiries, please contact Your Adarsh.
