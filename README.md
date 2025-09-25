# 📘 Spring Boot Knowledge Repository / Repository di Conoscenza Spring Boot

---

## 📘 English Version

### What is Spring Boot?
Spring Boot is a **Java framework** that simplifies web application development by reducing configuration overhead. It provides **defaults, embedded servers**, and makes it easy to start building applications.

### Why Spring Boot is Popular
- Simplifies Java web development (less configuration, less boilerplate).  
- Follows **Convention over Configuration** (sensible defaults).  
- Comes with a built-in server (**Tomcat**).

### Comparison: Spring Boot vs ASP.NET
| Feature                | Spring Boot          | ASP.NET            |
|------------------------|-------------------|------------------|
| Language / Ecosystem    | Java (Maven, Gradle) | C# (.NET, NuGet) |
| Server                 | Embedded Tomcat     | Kestrel           |
| Approach               | Convention-based   | Convention-based  |

### Install & Setup
**Requirements:**
- JDK (at least Java 17)  
- IDE (IntelliJ IDEA, Eclipse, VS Code)  
- Build tool (Maven or Gradle)  
- Spring Initializr: [https://start.spring.io/](https://start.spring.io/)

### First App: Hello Spring Boot
1. Create project with Spring Initializr (add Spring Web dependency).  
2. Add `@SpringBootApplication` to main class.  
3. Create `@RestController` with `@GetMapping` to return `Hello Spring Boot!`.  
4. Run the app → visit [http://localhost:8080/](http://localhost:8080/).

### What is Spring?
- **Java** = language & standard libraries.  
- **Spring** = framework for enterprise/web apps (DI, MVC, Data, Security).  
- **Spring Boot** = simplified Spring with conventions and defaults.

### Boilerplate Code
- Boilerplate = repetitive setup code.  
- **Without Spring Boot:** setting up servers, request parsing, and config requires lots of code.  
- **With Spring Boot:** just write a `@RestController` and get started quickly.

### Dependency Injection (DI)
- Let the framework provide objects your class needs (`@Autowired`).  
- Reduces tight coupling, increases flexibility & testability.  

**DI and Testing:**
- Interfaces define contracts.  
- DI injects implementations at runtime.  
- Tests can inject mocks/fakes → faster, isolated testing.

### Tomcat
- Java web server + servlet container.  
- Traditional: deploy WAR externally.  
- Spring Boot: embeds Tomcat inside the JAR.

### Convention over Configuration
- Auto-scans components.  
- Default server port = 8080.  
- JSON serialization pre-configured.

### Key Annotations
- `@SpringBootApplication` → entry point, enables auto-configuration.  
- `@RestController` → marks a class as REST API controller.  
- `@GetMapping` → maps HTTP GET requests.  
- `@Autowired` → injects dependencies automatically.

### 🚀 APIs in Spring Boot
- Build **RESTful APIs** using HTTP methods (GET, POST, PUT, DELETE) and JSON.  

**Why APIs are Important:**
- Allow web/mobile clients to interact with backend.  
- Make apps scalable and reusable.  
- Enforce separation of concerns.

**Best Practices:**
- RESTful conventions → resources, not actions (`/api/users/{id}/habits`).  
- Layered architecture → Controller, Service, Repository.  
- Consistent naming → plural nouns, nested resources.  
- Proper HTTP status codes → 200 OK, 201 Created, 404 Not Found.  
- Use DTOs → don’t expose entities directly.  
- Input validation → `@NotNull`, `@Email`.  
- Error handling → structured JSON responses.  
- Documentation → Swagger/OpenAPI.

**Analogy:**  
Database = kitchen 🍳  
API = waiter 🧑‍🍳  
Frontend = customer 🍽️  

The waiter (API) takes the order, passes it to the kitchen, and serves the meal in the right format.

---

## 📗 Italian Version

### Che cos’è Spring Boot?
Spring Boot è un **framework Java** che semplifica lo sviluppo di applicazioni web riducendo la configurazione. Fornisce **impostazioni predefinite, server incorporati** e permette di iniziare a sviluppare velocemente.

### Perché Spring Boot è Popolare
- Semplifica lo sviluppo web in Java (meno configurazione, meno codice ripetitivo).  
- Segue il principio di **Convention over Configuration**.  
- Include un server integrato (**Tomcat**).

### Confronto: Spring Boot vs ASP.NET
| Feature                | Spring Boot         | ASP.NET            |
|------------------------|------------------|------------------|
| Linguaggio / Ecosistema | Java (Maven, Gradle) | C# (.NET, NuGet) |
| Server                 | Tomcat integrato   | Kestrel           |
| Approccio              | Basato su convenzioni | Basato su convenzioni |

### Installazione e Setup
**Requisiti:**
- JDK (almeno Java 17)  
- IDE (IntelliJ IDEA, Eclipse, VS Code)  
- Strumento di build (Maven o Gradle)  
- Spring Initializr: [https://start.spring.io/](https://start.spring.io/)

### Prima App: Hello Spring Boot
1. Creare progetto con Spring Initializr (aggiungere dipendenza Spring Web).  
2. Aggiungere `@SpringBootApplication` alla classe principale.  
3. Creare `@RestController` con `@GetMapping` che restituisca `Hello Spring Boot!`.  
4. Eseguire l’app → visitare [http://localhost:8080/](http://localhost:8080/).

### Che cos’è Spring?
- **Java** = linguaggio e librerie standard.  
- **Spring** = framework che semplifica lo sviluppo (DI, MVC, Data, Security).  
- **Spring Boot** = versione semplificata con convenzioni e impostazioni predefinite.

### Codice Boilerplate
- Codice boilerplate = codice ripetitivo di configurazione.  
- **Senza Spring Boot:** molta configurazione manuale.  
- **Con Spring Boot:** basta scrivere un `@RestController` e partire subito.

### Dependency Injection (DI)
- Il framework fornisce oggetti necessari (`@Autowired`).  
- Riduce tight coupling, aumenta flessibilità e testabilità.

**DI e Testing:**
- Le interfacce definiscono i contratti.  
- La DI inietta implementazioni a runtime.  
- Nei test si possono usare mock/fake → più veloce e isolato.

### Tomcat
- Web server Java + servlet container.  
- Tradizionale: deploy WAR esterno.  
- Spring Boot: Tomcat incluso nel JAR.

### Convention over Configuration
- Auto-scansione dei componenti.  
- Porta server predefinita = 8080.  
- Serializzazione JSON configurata automaticamente.

### Annotazioni Chiave
- `@SpringBootApplication` → punto d’ingresso, abilita auto-configurazione.  
- `@RestController` → segna classe come controller REST.  
- `@GetMapping` → mappa richieste HTTP GET.  
- `@Autowired` → inietta dipendenze automaticamente.

### 🚀 API in Spring Boot
- Costruzione di **API RESTful** con metodi HTTP (GET, POST, PUT, DELETE) e JSON.

**Perché sono importanti:**
- Consentono a web/mobile di interagire con il backend.  
- Rendono le app scalabili e riutilizzabili.  
- Separano dati, logica e presentazione.

**Best Practice:**
- Convenzioni REST → risorse, non azioni (`/api/users/{id}/habits`).  
- Architettura a livelli → Controller, Service, Repository.  
- Nomenclatura coerente → sostantivi plurali, risorse annidate.  
- Codici di stato corretti → 200 OK, 201 Created, 404 Not Found.  
- Usare DTO → non esporre entità direttamente.  
- Validazione input → `@NotNull`, `@Email`.  
- Gestione errori → risposte JSON strutturate.  
- Documentazione → Swagger/OpenAPI.

**Analogia:**  
Database = cucina 🍳  
API = cameriere 🧑‍🍳  
Frontend = cliente 🍽️  

Il cameriere (API) prende l’ordine, lo porta in cucina e serve il piatto nel formato giusto.
