# TodoApp_TelosaTechnology

# Overview of the ToDo Application

The ToDo application was developed to demonstrate my understanding of backend development and the use of the Spring Boot framework. The application manages tasks (ToDo items) and provides functionality to add, update, delete, and view these tasks. It has been implemented in two distinct ways:

## 1. ToDo Application Using Local Storage/Session Storage

This implementation focuses on utilizing the browser's local storage or session storage to persist data.

Storage Mechanism:

Data is stored in the browser's local storage or session storage instead of a database.
Local storage persists data even after the browser is closed, while session storage clears data when the session ends.

Exclusion of Database Annotations:

The application does not involve any database configuration or annotations like @Entity, @Repository, or @Table.

## 2. ToDo App Using a Database

Storage Mechanism:

A relational database (MySQL) is used to persist ToDo tasks.
Tables store task details like ID, status, description.

Proper use of annotations like:

@Entity for mapping classes to database tables.
@Id, @GeneratedValue for primary keys.
@Repository for data access layer integration.
The repository layer interacts with the database via Spring Data JPA.

## Additional Feature

Light/Dark Theme Toggle Theme Switching:

A button is implemented in the front end to toggle between light and dark themes.
The feature dynamically changes the application’s appearance for better user experience.

## Conclusion
By developing the ToDo application in two ways, I explored both lightweight and full-stack approaches. This task helped solidify my understanding of Spring Boot's capabilities, REST API development, client-side storage, and database integration. The project highlights my ability to adapt to various requirements and implement scalable solutions effectively.
