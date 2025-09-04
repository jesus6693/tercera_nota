# Java Employee Management Application

This project is a simple Java application designed to manage employee information within a company. It includes functionality to create employee objects, set their attributes, and display their information. The application also includes salary validation and a method to increase salaries conditionally.

## Project Structure

```
java-employee-app
├── src
│   └── company
│       ├── hr
│       │   └── Employee.java
│       └── main
│           └── Main.java
└── README.md
```

## Classes

### Employee Class

- **Package**: `company.hr`
- **Attributes**:
  - `public String name`: The name of the employee.
  - `private double salary`: The salary of the employee (must be greater than 0).
  - `protected String role`: The role of the employee.

- **Methods**:
  - `public String getName()`: Returns the name of the employee.
  - `public void setName(String name)`: Sets the name of the employee.
  - `protected String getRole()`: Returns the role of the employee.
  - `protected void setRole(String role)`: Sets the role of the employee.
  - `public double getSalary()`: Returns the salary of the employee.
  - `public void setSalary(double salary)`: Sets the salary of the employee with validation.
  - `public void increaseSalary(double amount)`: Increases the salary by the specified amount if the amount is positive.

### Main Class

- **Package**: `company.main`
- **Functionality**: Contains the `main` method to execute the application. It creates two `Employee` objects, sets their names, roles, and salaries, and displays their information using the getters from the `Employee` class.

## How to Run

1. Ensure you have Java Development Kit (JDK) installed on your machine.
2. Clone the repository or download the project files.
3. Navigate to the project directory in your terminal.
4. Compile the Java files using the command:
   ```
   javac src/company/hr/Employee.java src/company/main/Main.java
   ```
5. Run the application using the command:
   ```
   java -cp src company.main.Main
   ```

## Additional Information

This project serves as a basic example of object-oriented programming in Java, demonstrating encapsulation, inheritance, and method validation. It can be expanded with additional features such as employee management, data persistence, and user interfaces.