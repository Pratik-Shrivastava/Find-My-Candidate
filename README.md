# Find-My-Candidate

## 🚀 Overview
**Find My Candidate** is a smart hiring platform that streamlines the recruitment process by enabling HR professionals to post jobs, parse resumes, rank candidates, and manage applications efficiently.

## 🎯 Key Features

### 🔹 HR Job Posting (Backend: Spring Boot)
- **Admin Interface:** Secure portal for HR to create, edit, and delete job postings.
- **Job Schema Includes:**
    - Job Title, Description, Skills, Experience Level
    - Location, Salary Range, Application Deadline
    - Job Type (Full-time, Part-time, Contract), Number of Openings
- **API Endpoints:** CRUD operations for job postings.

### 🔹 Candidate Application Form (Frontend: React)
- **User-Friendly Interface:** Simple and intuitive form for candidates.
- **Form Fields:**
    - Personal Info (Name, Contact, Location)
    - Resume Upload (PDF, DOCX)
    - Education, Skills, Experience, Cover Letter (Optional)
    - Portfolio Links (GitHub, LinkedIn, etc.)
    - Custom Questions (HR-defined questions)
- **Validation:** Ensures data integrity.

### 🔹 Resume Parsing & Candidate Matching (Backend: Spring Boot)
- **Resume Parsing:**
    - Extracts Skills, Experience, Education, and Contact Information.
    - Uses **Apache Tika, PDFBox, or AI-driven APIs (Affinda, Textkernel)**.
- **Matching Algorithm:**
    - Keyword Matching & NLP-based Skill Normalization.
    - **Scoring System:**
        - Weighted criteria for Skills, Experience, and Custom Questions.
        - Rank candidates based on their relevance to the job.

# 📋 Find My Candidate – Backend Documentation

---

### 🔹 HR Review & Candidate Management

- **Candidate List:** View and rank candidates.
- **Candidate Profile:** Access detailed resumes and application insights.
- **Filtering & Sorting:** Search using various criteria.
- **Feedback & Status Tracking:** Manage notes and hiring statuses.

---

### 🔹 Technologies Used

- **Backend:** Java 17, Spring Boot, Hibernate, JWT
- **Database:** PostgreSQL
- **Build Tool:** Maven
- **API Tools:** Swagger (for API documentation), Postman (for API testing)

---

### 🔹 Software & Tools

- **IDE:** IntelliJ IDEA for backend development
- **Database Tool:** `psql` terminal for PostgreSQL
- **Testing:** Postman for API testing

---

## 👥 User Modules

### 1. Administrator Module
- Login and manage other administrators
- Manage job categories
- View and manage jobs, applicants, employers, and employees

### 2. Employer Module
- Register and login
- Post job listings
- View applicants and manage application statuses

### 3. Employee Module
- Register and login
- Search and apply for jobs
- View, update profile, and track applications
- Cancel applied jobs

---

## 🗂️ Database Schema

![DB_SCHEMA](/server/backend/src/main/resources/database/FMC%20Schema.png)

---

## 🔌 API Endpoints

### 📍 Authentication APIs
![Auth APIs](/server/backend/src/main/resources/static/REST%20APIs%20for%20Auth.PNG)

- `POST /api/auth/login` – Authenticate user and obtain JWT
- `POST /api/auth/signin` – Register a new Employer or Employee

---

### 📍 Employer APIs
![Employer APIs](server/backend/src/main/resources/static/REST%20APIs%20for%20Employer.png)

- `POST /api/employers` – Create a new Employer
- `POST /api/employers/{employerId}/jobs` – Post a new Job
- `POST /api/employers/{employerId}/myApplications/{applicationId}` – Update application status
- `GET /api/employers` – List all Employers
- `GET /api/employers/{employerId}/jobs` – View all jobs posted by an Employer
- `GET /api/employers/{employerId}/myApplications` – View applications for Employer's jobs
- `DELETE /api/employers/{employerId}/jobs/{jobId}` – Delete a posted job

---

### 📍 Employee APIs
![Employee APIs](server/backend/src/main/resources/static/REST%20APIs%20for%20Employee.png)

- `POST /api/employees` – Create a new Employee
- `POST /api/employees/{employeeId}/profileDetails` – Edit profile details
- `POST /api/employees/{employeeId}/skills` – Update skills
- `POST /api/employees/{employeeId}/qualifications` – Update qualifications
- `POST /api/employees/{employeeId}/workExperiences` – Update work experience
- `POST /api/employees/{employeeId}/jobs/{jobId}/apply` – Apply for a job
- `GET /api/employees` – List all Employees
- `GET /api/employees/{employeeId}` – Get Employee details by ID
- `GET /api/employees/{employeeId}/jobs/yourApplications` – View submitted applications

---

### 📍 Job Category APIs
![Job Categories](server/backend/src/main/resources/static/REST%20APIs%20for%20Job%20Categories.PNG)

- `POST /api/jobCategories` – Create a job category
- `GET /api/jobCategories` – List all job categories
- `PUT /api/jobCategories/{id}` – Update a job category
- `DELETE /api/jobCategories/{id}` – Delete a job category

---

### 📍 Job APIs
![Job APIs](server/backend/src/main/resources/static/REST%20APIs%20for%20Job%20Categories.PNG)

- `GET /api/jobs` – List all jobs
- `GET /api/jobs/{jobId}` – Get job details by ID
- `GET /api/jobs/search` – Search jobs by category, location, or type (Part/Full-time)

---

### 📍 Job Application APIs
![Job Application APIs](server/backend/src/main/resources/static/REST%20APIs%20for%20Job%20Application.PNG)

- `GET /api/jobs/jobApplications` – List all applications

---

## 🚀 Getting Started

### 1️⃣ Clone the Repository

```bash
git clone https://github.com/Pratik-Shrivastava/Find-My-Candidate.git
cd Find-My-Candidate
```

---

### 2️⃣ Open the Project

Open the **backend** folder in your preferred IDE, such as **IntelliJ IDEA** or **Spring Tool Suite (STS)**.

---

### 3️⃣ Configure the Database

Update your local database configuration in:

```
src/main/resources/application.properties
```

Modify the following properties based on your setup:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/your_database
spring.datasource.username=your_username
spring.datasource.password=your_password
```

Make sure your PostgreSQL server is running and the database exists.

---

### 4️⃣ Run the Application

- **Build** and **Run** the Spring Boot application from your IDE or via the command line:
  ```bash
  mvn clean install
  mvn spring-boot:run
  ```

- The backend will be available at:  
  [http://localhost:8080](http://localhost:8080)

---
