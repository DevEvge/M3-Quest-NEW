# QuestGame

**QuestGame** is an interactive, web‑based quiz adventure written in Java. Players navigate a branching storyline by answering a series of questions.

---

## 🔧 Technologies

- **Java 17** — core language  
- **Servlet API 4.0** — HTTP request handling & session management  
- **JSP** — server‑side page rendering  
- **JUnit 5** & **Mockito** — unit tests and mocks  
- **Maven** — build, dependency management  
- **Apache Tomcat 9** — servlet container (deployment)

---

## 📂 Project Structure
src/
├── main/
│ ├── java/ # Servlets & business logic
│ └── webapp/ # JSP pages & static assets (CSS, images)
└── test/java/ # JUnit tests
pom.xml # Maven configuration

---

## 🚀 Build & Run

1. **Prerequisites**:  
   - Java 17  
   - Maven  
   - (Optional) Docker  

2. **Build**:
   ```bash
   mvn clean package

   Deploy:

Copy target/QuestGame.war into Tomcat’s webapps/ folder

Or run via Maven Tomcat plugin:
mvn tomcat7:run
Play:
Open your browser at http://localhost:8080/QuestGame

Enjoy the adventure—your choices shape the story!
