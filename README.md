# BlackCoffer User Data Management

This repository contains the source code for the BlackCoffer User Data Management system. It provides functionality to upload and process CSV files containing user data and retrieve the stored data.

## Installation and Setup

1. Clone the repository:

   ```shell
   git clone https://github.com/blackcoffer/user-data-management.git

cd user-data-management
Build the project using your preferred build tool (e.g., Maven or Gradle).

Configure the database connection in the application.properties file.

Run the application.
Endpoints

The following endpoints are available in the UserDataController:
Upload Data

Endpoint: POST /blackcoffer/upload

This endpoint allows the user to upload a CSV file containing user data. The file should be sent as a multipart/form-data request parameter named "file". If the upload is successful, the data will be processed and saved.
Get All Data

Endpoint: GET /blackcoffer/show

This endpoint retrieves all the user data stored in the system. It returns a list of UserDataDto objects containing the user data.
ERD (Entity Relationship Diagram)

The ERD diagram illustrates the relationships between the entities in the BlackCoffer User Data Management system. The entities and their relationships are as follows:

ERD Diagram

    User Data: Represents the user data stored in the system. It contains attributes such as user ID, name, email, and other relevant information.

Technologies Used

The following technologies and frameworks were used in the development of this project:

    Java
    Spring Boot
    Spring MVC
    Spring Data JPA
    MySQL 
    Maven 

Feel free to explore the source code for more details on the implementation.