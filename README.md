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

### 🔹 HR Review & Candidate Management
- **Candidate List:** View ranked candidates.
- **Candidate Profile:** Detailed resume and application insights.
- **Filtering & Sorting:** Search based on various criteria.
- **Feedback & Status Tracking:** Notes and hiring status management.

### 🔹 Additional Features
- **📊 Analytics Dashboard**: Insights into job postings, applications, and hiring trends.
- **🤖 AI Chatbot**: Answer FAQs and assist candidates.
- **📅 Interview Scheduling**: Integrate with **Google Calendar API, Outlook API**.
- **🛡 Security & Compliance**: GDPR, CCPA compliance with encrypted candidate data.

## 🛠 Tech Stack
- **Frontend:** React.js, Tailwind CSS
- **Backend:** Spring Boot, Java
- **Database:** PostgreSQL / MongoDB
- **Resume Parsing:** Apache Tika, PDFBox, AI APIs
- **Deployment:** Docker, AWS/GCP

## 📌 API Endpoints

### 🔹 Job Posting APIs
```plaintext
POST /api/jobs         → Create a job posting
GET /api/jobs          → List all jobs
GET /api/jobs/{id}     → Get job details
PUT /api/jobs/{id}     → Update job posting
DELETE /api/jobs/{id}  → Delete job posting
```

### 🔹 Candidate APIs
```plaintext
POST /api/candidates         → Submit candidate application
GET /api/candidates          → List all candidates
GET /api/candidates/{id}     → Get candidate details
PUT /api/candidates/{id}     → Update candidate profile
DELETE /api/candidates/{id}  → Delete candidate profile
```

### 🔹 Resume Parsing APIs
```plaintext
POST /api/resumes/parse      → Upload and parse resume
GET /api/resumes/{id}        → Retrieve parsed resume data
```

### 🔹 Candidate Matching APIs
```plaintext
POST /api/matching/job/{jobId}  → Run matching algorithm for a job
GET /api/matching/job/{jobId}   → Get matched candidates for a job
```

## 📂 Folder Structure
```
FindMyCandidate/
│-- backend/    # Spring Boot Backend
│-- frontend/   # React Frontend
│-- docs/       # Documentation
│-- README.md   # Project Readme
```

## 🚀 Getting Started

### 1️⃣ Clone the Repository
```sh
git clone https://github.com/your-username/find-my-candidate.git
cd find-my-candidate
```

### 2️⃣ Backend Setup
```sh
cd backend
mvn clean install
mvn spring-boot:run
```

### 3️⃣ Frontend Setup
```sh
cd frontend
npm install
npm start
```

## 📌 Contributing
We welcome contributions! Feel free to submit **issues**, **feature requests**, or **pull requests**.

## 📜 License
This project is NOT licensed.