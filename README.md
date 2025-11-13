# 💍 Jewelry Inventory App

A modular Spring Boot backend for managing jewelry inventory. Designed for local development with a JSON-based data source and structured for future integration with persistent storage and cloud deployment.

---

## 🚀 Getting Started (Local Profile)

Run the app locally using the `local` Spring profile, which loads inventory data from `data.json`.

### ✅ Prerequisites

- Java 17+
- Gradle 8+
- Git
- IDE (IntelliJ IDEA, VS Code, etc.)

### 📦 Clone the Repository

```bash
git clone https://github.com/code-monkie/betty-white.git
cd betty-white
```

### 🧪 Run with the `local` Profile

```bash
./gradlew bootRun --args='--spring.profiles.active=local'
```

This will:

- Create the db with `data.json` from `src/main/resources`
- Load `data.json` from `src/main/resources`
- Expose Data Rest endpoints under [`JewelryRepo`](src/main/java/org/codemonkie/bettywhite/domain/JewelryRepo.java)
- Use in-memory data only—no external DB required

### 🔍 Sample Endpoints

| Method | Endpoint             | Description                        |
|--------|----------------------|------------------------------------|
| GET    | `/jewelry`       | List all jewelry items             |
| GET    | `/jewelry/{id}`  | Get details for a specific item    |
| POST   | `/jewelry`       | Add a new item (local only)        |

> Note: POST/PUT/DELETE are no-ops in `local` mode unless explicitly enabled for testing.

---

### ✅ Add a Dedicated “API Documentation” Section

If you want to keep things modular:

```markdown
## 📚 API Documentation

Interactive API docs are available via Swagger UI:

🔗 [http://localhost:8080/swagger-ui/index.html](http://localhost:8080/swagger-ui/index.html)

This interface allows you to:

- View available endpoints
- Try out requests with sample data
- See expected request/response formats

---

## 🧱 Project Structure

```
src/
├── main/
│   ├── java/com/example/jewelry/
│   │   ├── controller/
│   │   ├── model/
│   │   ├── service/
│   │   └── config/
│   └── resources/
│       ├── application.yml
│       ├── application-local.yml
│       └── data.json
```

---

## 🛠️ Profiles

- `local`: Loads from `data.json`, no DB
- `dev`: (Planned) Connects to dev DB
- `prod`: (Planned) Cloud-ready configuration

---

## 🧪 Testing

```bash
./gradlew test
```

Unit tests cover controller and service layers using mock data.

---

## 🧭 Roadmap

- [ ] Add persistent storage (PostgreSQL or DynamoDB)
- [ ] Swagger/OpenAPI docs
- [ ] Role-based access control
- [ ] Admin UI for inventory management
