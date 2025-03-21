# Car & Person Java Program

## 📄 Description
This Java program models a simple real-world system consisting of **persons** and **a car**. It demonstrates **object-oriented programming (OOP)** concepts such as **encapsulation, composition, constructors, method overloading, object comparison**, and **input validation**.

The core idea is to represent people (`Person` class) and simulate how they interact with a car (`Car` class) by setting drivers, adding passengers, and checking the car's status.

## 🏢 Classes Overview

### ✅ **Person.java**
- Models a person with:
  - `name`, `age`, and `gender`
- Provides:
  - Getters & setters with validation
  - Equality checks
  - Comparison based on name and age

### ✅ **Car.java**
- Models a car with:
  - One driver and up to four passengers
- Key methods:
  - `hasDriver()`, `hasPassengers()`, `isEmpty()`, `isFull()`
  - `setDriver(Person)`, `addPassenger(Person)`, `getNumOccupant()`
  - `listRiders()` to display all current occupants

## 📈 Test Classes

### ✅ **TestCar.java**
- Demonstrates functionality of the `Car` class:
  - Creates cars with and without drivers
  - Adds passengers
  - Displays the car state
  - Validates input rules (e.g., driver must be 18+)

### ✅ **TestPerson.java**
- Demonstrates functionality of the `Person` class:
  - Creates several `Person` objects
  - Compares equality and differences
  - Takes user input to create a new person

## 🚀 How to Run

### 📅 Prerequisites:
- Java Development Kit (JDK) installed

### ⚙️ Compile:
```bash
javac Person.java Car.java TestPerson.java TestCar.java
```

### 🔄 Run:
```bash
java TestPerson
java TestCar
```

## 🔍 Sample Outputs
```java
The driver is successfully set.
Daniel has been successfully added to the front seat.
Marie has been successfully added to the third and last back seat.
The car is not empty.
The car is full.
The car has 5 occupants.
The driver is a 20 years old male named Mushagalussa.
The front seat passenger is a 5 years old male named Daniel.
...
```

## 🚀 Features
- Object equality and comparison
- Passenger management with capacity check
- Driver validation by age
- Console-based user input

## 🌟 Future Enhancements
- Implement car removal and replacement methods
- Add GUI interface for better interaction
- Store car and person data in files or a database

---
Contributions and improvements are welcome! 🚗👨‍💼

Clovis Mushagalusa CIRUBAKADERHA

