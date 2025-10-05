# Student Club Activity Tracker

This is a full-stack web application to manage and monitor student participation in clubs.

## Features

- **User Roles**: Admin, Club Coordinator, Student
- **Student Management**: Add/edit/delete students, assign them to clubs.
- **Club Management**: Create clubs, manage members, list activities.
- **Activity Tracking**: Add activities/events under clubs, record student participation.
- **Leaderboard & Analytics**: Show top active students, club-wise rankings, and total participation points.
- **Reports**: Generate downloadable reports (CSV/PDF).
- **Authentication**: Login and role-based access control.

## Tech Stack

**Backend:**
- Java 17+
- Spring Boot 3.x
- Hibernate
- MySQL
- Lombok
- Maven

**Frontend:**
- React.js (with Vite)
- Axios
- React Router
- Tailwind CSS
- Chart.js

## Setup and Run

### Prerequisites

- Java 17+
- Maven
- Node.js and npm
- Docker and Docker Compose

### Backend

1. **Navigate to the backend directory:**
   ```bash
   cd backend
   ```
2. **Install dependencies:**
   ```bash
   mvn install
   ```
3. **Run the application:**
   ```bash
   mvn spring-boot:run
   ```
The backend will be running on `http://localhost:8080`.

### Frontend

1. **Navigate to the frontend directory:**
   ```bash
   cd frontend
   ```
2. **Install dependencies:**
   ```bash
   npm install
   ```
3. **Run the application:**
   ```bash
   npm run dev
   ```
The frontend will be running on `http://localhost:5173`.

### Docker

1. **Build and run the containers:**
   ```bash
   docker-compose up --build
   ```

## API Endpoints

- `POST /api/auth/register`: Register a new user.
- `POST /api/auth/login`: Login a user.
- `GET /api/clubs`: Get all clubs.
- `POST /api/clubs`: Create a new club.
- `GET /api/clubs/{id}`: Get a club by ID.
- `PUT /api/clubs/{id}`: Update a club.
- `DELETE /api/clubs/{id}`: Delete a club.
- `GET /api/activities`: Get all activities.
- `POST /api/activities`: Create a new activity.
- `GET /api/activities/{id}`: Get an activity by ID.
- `PUT /api/activities/{id}`: Update an activity.
- `DELETE /api/activities/{id}`: Delete an activity.
