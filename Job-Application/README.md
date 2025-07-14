# 💼 Job Application API

A RESTful API for managing job listings built with Spring Boot. This project demonstrates CRUD operations, REST API design, and Spring Boot fundamentals.

## 🚀 Features

- **Create Job**: Add new job listings
- **Get All Jobs**: Retrieve all available jobs
- **Get Job by ID**: Fetch specific job details
- **Update Job**: Modify existing job information
- **Delete Job**: Remove job listings
- **In-Memory Storage**: Uses ArrayList for data persistence (no database required)

## 🛠️ Tech Stack

- **Java 17** (or your version)
- **Spring Boot 3.x**
- **Spring Web**
- **Maven** for dependency management
- **Postman** for API testing

## 📦 Installation & Setup

### Prerequisites
- Java 17 or higher
- Maven 3.6+
- IDE (IntelliJ IDEA recommended)

### Steps to Run
1. **Clone the repository**
   ```bash
   git clone https://github.com/yourusername/job-application-api.git
   cd job-application-api
   ```

2. **Build the project**
   ```bash
   mvn clean install
   ```

3. **Run the application**
   ```bash
   mvn spring-boot:run
   ```

4. **Access the API**
    - Base URL: `http://localhost:8080`
    - API endpoints: `http://localhost:8080/jobs`

## 🔗 API Endpoints

| Method | Endpoint | Description | Request Body |
|--------|----------|-------------|--------------|
| `GET` | `/jobs` | Get all jobs | None |
| `POST` | `/jobs` | Create a new job | Job JSON |
| `GET` | `/jobs/{id}` | Get job by ID | None |
| `PUT` | `/jobs/{id}` | Update job by ID | Job JSON |
| `DELETE` | `/jobs/{id}` | Delete job by ID | None |

## 📄 API Documentation

### Job Model
```json
{
  "id": 1,
  "title": "Software Engineer",
  "description": "Develop and maintain web applications",
  "minSalary": "60000",
  "maxSalary": "80000",
  "location": "Remote"
}
```

### Example Requests

#### 1. Create a Job
```bash
POST http://localhost:8080/jobs
Content-Type: application/json

{
  "title": "Java Developer",
  "description": "Backend development with Spring Boot",
  "minSalary": "70000",
  "maxSalary": "90000",
  "location": "New York"
}
```

#### 2. Get All Jobs
```bash
GET http://localhost:8080/jobs
```

#### 3. Get Job by ID
```bash
GET http://localhost:8080/jobs/1
```

#### 4. Update Job
```bash
PUT http://localhost:8080/jobs/1
Content-Type: application/json

{
  "title": "Senior Java Developer",
  "description": "Lead backend development team",
  "minSalary": "80000",
  "maxSalary": "100000",
  "location": "San Francisco"
}
```

#### 5. Delete Job
```bash
DELETE http://localhost:8080/jobs/1
```

## 🧪 Testing the API

### Using Postman
1. Import the Postman collection from `/postman/Job-API-Collection.json`
2. Run the requests in the following order:
    - POST to create jobs
    - GET to retrieve jobs
    - PUT to update jobs
    - DELETE to remove jobs

### Using cURL
```bash
# Create a job
curl -X POST http://localhost:8080/jobs \
  -H "Content-Type: application/json" \
  -d '{
    "title": "Data Scientist",
    "description": "Analyze large datasets",
    "minSalary": "80000",
    "maxSalary": "110000",
    "location": "Boston"
  }'

# Get all jobs
curl http://localhost:8080/jobs

# Get job by ID
curl http://localhost:8080/jobs/1
```

## 📊 Response Examples

### Success Response (GET /jobs)
```json
[
  {
    "id": 1,
    "title": "Java Developer",
    "description": "Backend development with Spring Boot",
    "minSalary": "70000",
    "maxSalary": "90000",
    "location": "New York"
  }
]
```

### Error Response (Job Not Found)
```
HTTP Status: 404 NOT FOUND
```

## 🎯 Key Learning Outcomes

This project demonstrates:
- ✅ **REST API Design** - Proper HTTP methods and status codes
- ✅ **Spring Boot Fundamentals** - Controllers, Services, Dependency Injection
- ✅ **CRUD Operations** - Create, Read, Update, Delete functionality
- ✅ **HTTP Status Codes** - Proper response handling
- ✅ **Request/Response Mapping** - JSON serialization/deserialization
- ✅ **Service Layer Pattern** - Separation of concerns

## 🔄 What's Next?

Future enhancements planned:
- [ ] Database integration with JPA/Hibernate
- [ ] Input validation with Bean Validation
- [ ] Exception handling with @ControllerAdvice
- [ ] Unit and integration tests
- [ ] API documentation with Swagger
- [ ] Security with Spring Security

## 🤝 Contributing

This is a learning project, but feel free to:
1. Fork the repository
2. Create your feature branch
3. Commit your changes
4. Push to the branch
5. Create a Pull Request

## 📝 Notes

- This project uses in-memory storage (ArrayList)
- Data will be lost when the application restarts
- No database setup required for testing
- Perfect for learning Spring Boot basics

## 👨‍💻 Author

**Rahul** - Computer Science Student
- GitHub: [@RahulDotExe](https://github.com/RahulDotExe)
- Learning: Spring Boot, Java Backend Development

---

*Built as part of Spring Boot learning journey - Week 1: REST API Fundamentals*