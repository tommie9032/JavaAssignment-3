# Student Management System (Java)

## Overview
This is a simple **Student Management System** implemented in **Java**. It allows users to:
- Add student details
- Display all students
- Search for a student by name or PRN
- Edit student details
- Delete a student

The program uses **Object-Oriented Programming (OOP)** principles and utilizes an **ArrayList** to store student data.

---

## **Project Structure**
- **`Student.java`** - Defines the `Student` class and its properties.
- **`StudentOperations.java`** - Contains methods for managing student records.
- **`Main.java`** - Handles user interaction via a **menu-driven console application**.

---

## **Classes and Methods Description**
### **1. Student.java**
This class defines a **Student** with attributes:
- `name` (String) - Student's name.
- `age` (int) - Student's age.
- `gender` (String) - Student's gender.
- `prn` (long) - Unique PRN number.
- `grade` (double) - Student's grade.

**Methods:**
| Method | Description |
|--------|-------------|
| `Student(String name, int age, String gender, long prn, double grade)` | Constructor to initialize a student object. |
| `setName(String name)` | Sets the student's name. |
| `setAge(int age)` | Sets the student's age. |
| `setGender(String gender)` | Sets the student's gender. |
| `setPrn(long prn)` | Sets the student's PRN. |
| `setGrade(double grade)` | Sets the student's grade. |
| `getName()` | Returns the student's name. |
| `getAge()` | Returns the student's age. |
| `getGender()` | Returns the student's gender. |
| `getPrn()` | Returns the student's PRN. |
| `getGrade()` | Returns the student's grade. |
| `display()` | Prints student details. |

---

### **2. StudentOperations.java**
This class contains an **ArrayList** of `Student` objects and provides functions to manage them.

**Methods:**
| Method | Description |
|--------|-------------|
| `addStudent(Student student)` | Adds a new student to the list. |
| `displayStudents()` | Displays all students. |
| `searchByName(String name)` | Searches for a student by name. |
| `searchByPrn(long prn)` | Searches for a student by PRN. |
| `searchStudent()` | Allows user to search by name or PRN. |
| `deleteStudent()` | Deletes a student by PRN. |
| `editStudent()` | Allows the user to update student details. |

---

### **3. Main.java**
This class contains the **main method** and runs a **menu-driven program** for user interaction.

**Features:**
1. **Add Student**
2. **Display Student**
3. **Search Student (by Name or PRN)**
4. **Edit Student Details**
5. **Delete Student**
6. **Exit Program**

---

## **How to Run**
1. Clone the repository:
   ```sh
   git clone https://github.com/your-username/Student-Management-System.git
  
