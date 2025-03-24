# motivator-backend
This is a Java Spring Boot backend application, with MongoDB as the database.

## Steps to Run the Backend Application (Java Spring Boot) Locally

1. **Run MongoDB in a Docker container**: First, you need to start MongoDB in a Docker container by running the following command:  

 **docker run -d --name mongo-db -p 27017:27017 -e MONGO_INITDB_ROOT_USERNAME=admin -e MONGO_INITDB_ROOT_PASSWORD=admin mongo**  
 
 2. **Clone the repository and start the Spring Boot application**: After cloning the repository, navigate to the project directory and run the application using Maven:**mvn spring-boot:run**  
 
   
 3.**Access the application**: The application will be running locally on port 8080. You can access it at: **<http://localhost:8080/motivations>**  

This will add one motivational quote by default.  



## Steps to add quotes from the MongoDB database manually
  
1. **Access the MongoDB shell**: To interact with MongoDB, enter the MongoDB shell by running the following command: :** docker exec -it mongo-db mongosh -u admin -p admin --authenticationDatabase admin **  

2. Verify that motivatorDB is added and contains a single quote:
   
    1. **show dbs**
    2. **db.motivations.find().pretty()**
       
4. **Add a new quote manually**: You can insert a new quote into the motivations collection using the following command

   
   **db.motivations.insertOne({
      "message": "Stay positive!",
      "author": "John Doe"
    })**
   
6. **Verify the new quote**: After adding the quote, you can verify it by accessing the application at: <http://localhost:8080/motivations>
   

**Note**: Ideally, the quote should be added by the frontend application <http://localhost:3000/>. Once the backend application is up and running, proceed to execute the frontend application and enter the quote directly through the user interface.  

![image](https://github.com/user-attachments/assets/5ff2d902-e3f4-4a81-85e2-111b4cb4ce92)  

![image](https://github.com/user-attachments/assets/e0600894-3823-43c3-85c8-1eec2819f966)  




