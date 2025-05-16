// --- README.md ---
# BookIt – API Automation Testing Suite

This is a simple room booking simulation written in Java to demonstrate API test automation using TestNG. No CI/CD tools are required. It is designed to show SDET skills including:

- Java + TestNG for writing test cases
- In-memory data logic using Java Collections (HashMap, Set)
- Manual and automated API-like logic testing
- Covers positive, negative, and edge test scenarios

## 🔧 How to Run

1. Clone the repo
2. Import as a Maven or Java project into IntelliJ or Eclipse
3. Run tests using `testng.xml`

## ✅ Features
- User registration
- Room booking
- Booking validations (duplicate booking, invalid room)
- Query available rooms and user bookings

## 📁 Structure
```
BookIt/
├── backend/               # Booking logic
├── tests/                 # TestNG test cases
├── testng.xml             # Test suite config
└── README.md
```

## 📌 Skills Demonstrated
- Java fundamentals
- Reusable test automation
- Data structure use in backend logic
- Clean code organization
- Strong debugging/assertion use

## 🧪 Future Enhancements
- Add CI/CD (GitHub Actions)
- RESTful API layer with Spring Boot
- Allure/Extent test reports
