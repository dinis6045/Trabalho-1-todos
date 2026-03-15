# Assignment 1 – Kotlin Exercises and Virtual Library

Course: Mobile Computing  
Student(s): Dinis Lino  
Date: 15 March 2026  
Repository URL: https://github.com/dinis6045/Trabalho-1-todos/tree/main/tp1

---

## 1. Introduction

This project corresponds to TP1 of the Mobile Computing course.

The purpose of this assignment is to practice fundamental Kotlin programming concepts and object-oriented programming. The work includes three introductory Kotlin exercises and one larger exercise focused on the implementation of a Virtual Library system.

The assignment covers topics such as arrays, functional programming, exception handling, sequences, classes, objects, inheritance, polymorphism, data classes, and companion objects.

---

## 2. System Overview

This project is composed of four main parts:

1. Exercise 1 – creation and initialization of arrays with the first 50 perfect squares using different Kotlin approaches.
2. Exercise 2 – development of a console-based calculator supporting arithmetic, boolean, and bitwise shift operations.
3. Exercise 3 – modelling of bouncing ball heights using Kotlin sequences.
4. Virtual Library – implementation of a library management system using object-oriented programming.

The project demonstrates both procedural and object-oriented use of Kotlin.

---

## 3. Architecture and Design

The project is organized into multiple Kotlin files and packages, each corresponding to a different exercise.

Main parts of the design:

- Exercise 1 uses arrays and functional mapping approaches.
- Exercise 2 uses conditional logic with `when`, exception handling, and formatted output.
- Exercise 3 uses `generateSequence`, filtering, and list conversion.
- Virtual Library uses a base class `Book`, subclasses `DigitalBook` and `PhysicalBook`, a manager class `Library`, and a data class `LibraryMember`.

The Virtual Library part follows an object-oriented structure with inheritance and abstraction.

---

## 4. Implementation

### Exercise 1
An integer array with the first 50 perfect squares was implemented in three different ways:

- using `IntArray`
- using a range with `map()`
- using `Array` with constructor

### Exercise 2
A console-based calculator was implemented to support:

- addition
- subtraction
- multiplication
- division
- boolean AND, OR, NOT
- left shift and right shift

The calculator uses:

- `when` expressions
- exception handling
- string templates
- formatted output

### Exercise 3
A sequence of bouncing ball heights was implemented using:

- `generateSequence`
- `filter`
- `take`
- conversion to list

The program starts from 100 meters, applies a 60% bounce ratio, and prints the first 15 valid bounces with height of at least 1 meter.

### Virtual Library
The Virtual Library system includes:

- `Book` as the base class
- `DigitalBook` and `PhysicalBook` as subclasses
- `Library` as the manager class
- `LibraryMember` as a data class

It supports book addition, borrowing, returning, listing, and searching by author.

---

## 5. Testing and Validation

The project was tested by executing each exercise independently.

Validation included:

- checking correct array generation in Exercise 1
- testing all calculator operations and invalid input handling in Exercise 2
- verifying the bounce sequence output in Exercise 3
- testing book creation, borrowing, returning, and author search in the Virtual Library exercise

The outputs produced by the programs were compared with the expected behaviour described in the assignment.

---

## 6. Usage Instructions

To run the project:

1. Clone the repository
2. Open the project in IntelliJ IDEA or Android Studio
3. Run the Kotlin file corresponding to the exercise you want to test

Requirements:

- Kotlin
- IntelliJ IDEA or Android Studio
- JDK installed and configured

---

# Autonomous Software Engineering Sections

## 7. Prompting Strategy

AI tools were used to assist in the structuring of the documentation and in clarifying Kotlin programming concepts.

Representative prompt usage included:

- requesting help to organize the README according to the required assignment structure
- clarifying object-oriented concepts such as inheritance and polymorphism
- improving the description of the implemented features

---

## 8. Autonomous Agent Workflow

AI tools contributed mainly to:

- documentation planning
- explanation of Kotlin syntax and concepts
- organization of report sections

The implementation of the code itself was primarily carried out manually by the student.

---

## 9. Verification of AI-Generated Artifacts

All AI-assisted outputs were manually reviewed before being included.

Verification methods included:

- manual review of text and code
- execution of all exercises
- comparison of outputs with the assignment requirements
- correction of any inconsistencies found during testing

---

## 10. Human vs AI Contribution

Primarily human-developed parts:

- implementation of the Kotlin exercises
- implementation of the Virtual Library logic
- testing and execution of the programs

AI-assisted parts:

- support in the writing of the README
- clarification of technical concepts
- help with structuring the report

---

## 11. Ethical and Responsible Use

AI tools were used only as support tools for explanation and documentation.

All final content was reviewed, understood, and validated by the student. Care was taken to ensure that the submitted work reflects the student's own implementation and understanding.

---

# Development Process

## 12. Version Control and Commit History

Version control was managed using Git and GitHub, as required in the assignment.

The commit history reflects the progression of the work throughout the development of the project, including implementation updates and documentation changes.

---

## 13. Difficulties and Lessons Learned

Main difficulties encountered during the assignment included:

- choosing appropriate Kotlin structures for each exercise
- handling exceptions and invalid input in the calculator
- understanding sequence generation in Kotlin
- designing the object-oriented structure of the Virtual Library

The assignment helped reinforce both Kotlin fundamentals and object-oriented programming skills.

---

## 14. Future Improvements

Possible future improvements include:

- adding a menu-based interface for selecting the exercises
- improving the calculator with additional operations
- extending the Virtual Library with file persistence
- adding more advanced search and member management features

---

## 15. AI Usage Disclosure (Mandatory)

AI tools used:

- ChatGPT

AI was used for documentation support, clarification of Kotlin concepts, and report structuring. All final content remains the responsibility of the student.
