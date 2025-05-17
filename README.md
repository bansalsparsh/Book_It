# BookIt – API Automation Testing Suite

BookIt is a Java-based room booking simulation to demonstrate core SDET skills: test automation, data handling, and test case design using TestNG. It is designed to showcase strong fundamentals in writing isolated, reusable automated test cases and backend logic simulation.

## 🔧 How to Run

1. Clone the repo  
2. Import as a Maven or Java project into IntelliJ or Eclipse  
3. Run automated tests using `testng.xml`  

## ✅ Features

- User registration  
- Room booking with validation  
- Prevent double-booking and invalid room bookings  
- Query available rooms and user-specific bookings  
- Isolated test cases ensuring no shared state interference  

## 📁 Project Structure

```plaintext
BookIt/
├── backend/               # Booking service implementation  
├── tests/                 # TestNG test cases  
├── testng.xml             # Test suite configuration  
└── README.md              
```

## 📌 Skills Demonstrated

- Java + TestNG for modular and isolated test cases  
- Strong use of collections (Map, Set) for backend logic modeling  
- Structured, beginner-friendly automation suite  
- Clean code organization and debugging/assertion skills  

## 🧪 Future Enhancements

- Integrate report generation tools like Allure or ExtentReports  
- Add RESTful API layer with Spring Boot  
- Introduce CI/CD pipeline for automated test runs and deployment
