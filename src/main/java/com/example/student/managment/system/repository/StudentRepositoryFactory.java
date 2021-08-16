package com.example.student.managment.system.repository;

public class StudentRepositoryFactory {
    public static StudentRepository getStudentRepository() {
        return new InMemoryStudentRepository();
    }
}