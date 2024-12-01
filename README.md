# Currency Converter

## Overview

The Currency Converter is a Java-based application that demonstrates the capabilities of JavaFX for building graphical user interfaces (GUIs) and the integration of backend services using Spring Boot. This project aims to provide a user-friendly interface for converting amounts between different currencies using real-time exchange rates.

### Key Features
- Real-time currency conversion
- User-friendly GUI built with JavaFX
- Backend services powered by Spring Boot
- Integration with ExchangeRate-API for up-to-date exchange rates

## Development Environment

### Tools and Technologies
- **IDE**: IntelliJ IDEA
- **Build Tool**: Apache Maven
- **Version Control**: Git
- **Frontend Framework**: JavaFX
- **Backend Framework**: Spring Boot
- **Java Development Kit**: JDK 17

### Libraries
- JavaFX (GUI)
- Spring Boot (Backend Services)
- OpenJFX (JavaFX Modules)

## API Integration

The project uses [ExchangeRate-API](https://app.exchangerate-api.com/dashboard) to fetch real-time exchange rates. It follows the ISO 4217 standard for currency codes to ensure consistency and accuracy.

## Getting Started

### Prerequisites
- Java Development Kit (JDK) 17
- Maven
- Git

### Installation and Running the Project

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/currency-converter.git
   cd currency-converter
   ```

2. Build and Run the Backend:
   ```bash
   cd backend
   mvn clean install
   mvn spring-boot:run
   ```

3. Build and Run the Frontend:
   ```bash
   cd ../frontend
   mvn clean install
   mvn javafx:run
   ```

#### Windows Users
A `run_project.bat` file is provided in the root directory. Double-click to automatically build and run both backend and frontend components.

## Useful Resources

- [JavaFX Documentation](https://openjfx.io/)
- [Spring Boot Documentation](https://spring.io/projects/spring-boot)
- [Maven Documentation](https://maven.apache.org/guides/)
- [Java Documentation](https://docs.oracle.com/en/java/)
- [ExchangeRate-API](https://www.exchangerate-api.com/)
- [ISO 4217 Currency Codes](https://www.iso.org/iso-4217-currency-codes.html)

## Future Improvements

- [ ] Improve error handling for invalid currency inputs
- [ ] Enhance user interface for better usability
- [ ] Implement additional currency conversion features
  - Historical exchange rates
  - More comprehensive real-time rate integration
- [ ] Develop comprehensive unit tests for frontend and backend

## Contributing

Contributions are welcome! Please feel free to submit a Pull Request.

## License

MIT

## Demo

[Software Demo Video](https://youtu.be/0fsIWj8MEyo )
