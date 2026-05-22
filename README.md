# Spring AI + Claude MCP Server

A simple example project demonstrating how to build an MCP (Model Context Protocol) Server using Java 21, Spring Boot 4, and Spring AI.

This project shows how to expose tools and capabilities that can be consumed by AI models such as Claude through the MCP protocol.

## 🚀 Technologies

- Java 21
- Spring Boot 4.0.6
- Spring AI 2.0.0-M6
- MCP Server Starter
- Maven

---

## 📦 Dependency

Main dependency used in this project:

```xml
<dependency>
    <groupId>org.springframework.ai</groupId>
    <artifactId>spring-ai-starter-mcp-server</artifactId>
</dependency>
```

---

## 📚 What is MCP?

MCP (Model Context Protocol) is a protocol that allows AI models to interact with external tools, APIs, and systems in a standardized way.

With MCP, an AI model can:

- Execute tools
- Access external data
- Trigger actions
- Interact with applications
- Extend its capabilities beyond text generation

This project demonstrates how to create an MCP server using Spring AI.

---

## ⚙️ Requirements

Before running the project, make sure you have installed:

- Java 21
- Maven 3.9+
- IDE of your choice (IntelliJ recommended)

---

## ▶️ Running the Project

Clone the repository:

```bash
git clone https://github.com/brunojdsz/spring-ai-claude-mcp.git
```

Enter the project folder:

```bash
cd spring-ai-claude-mcp
```

Run the application:

### Linux / Mac

```bash
./mvnw spring-boot:run
```

### Windows

```bash
mvnw.cmd spring-boot:run
```

---

## 🧠 Project Goal

The main goal of this project is to demonstrate:

- How to create an MCP server with Spring AI
- How AI models can interact with Java applications
- How to expose tools to LLMs
- Basic MCP integration concepts using Spring Boot

---

## 📁 Project Structure

```text
src
 └── main
     ├── java
     │    └── br/com/brunojdsz
     └── resources
```

---
## 📖 Spring AI

Official documentation:

https://spring.io/projects/spring-ai

---

## 🤝 Contributing

Contributions are welcome.

Feel free to open issues or submit pull requests.

---

## 📄 License

This project is open source and available under the MIT License.
