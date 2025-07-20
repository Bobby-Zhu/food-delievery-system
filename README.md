# Food Delivery System

A scalable Java-based backend for a food delivery platform. This system supports core business logic such as user management, order processing, menu item handling, and real-time order notifications.

## Features

- 70+ RESTful API endpoints
- Modular structure: user, order, category, dish, set meal, etc.
- JWT-based user authentication
- Redis caching for high-frequency data (e.g., categories)
- WebSocket for real-time order updates
- Nginx reverse proxy for multi-service simulation
- Role-based access control and logging
- Background scheduled tasks (e.g., auto-cancel unpaid orders)

## Tech Stack

- **Backend Framework**: Spring Boot
- **ORM**: MyBatis
- **Database**: MySQL
- **Cache**: Redis
- **Build Tool**: Maven
- **WebSocket**: Spring WebSocket
- **Authentication**: JWT
- **Reverse Proxy**: Nginx
- **Deployment Ports**:
    - Backend runs on `localhost:8081`

## Project Structure
- `sky-common/`: Shared utilities and configuration
- `sky-pojo/`: Data transfer and entity objects
- `sky-server/`: Main backend logic (controllers, services, mappers, etc.)


## How to Run

1. Start your MySQL and Redis services.
2. Modify `application.yml` with your local database/Redis configs.
3. Run the `SkyApplication` class in `sky-server`.
4. Access backend API on `http://localhost:8081`.

## Notes

- This is a backend-only implementation. The frontend is assumed to run separately on a different port.
- Focuses on modular and clean architecture, secure authentication, and production-simulated deployment practices.

---


