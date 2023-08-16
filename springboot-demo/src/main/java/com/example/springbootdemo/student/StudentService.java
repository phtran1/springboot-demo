package com.example.springbootdemo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class StudentService {
    public List<Student> getStudents(){
        return List.of(new Student(1L, "Sana", "Sana@gmail.com", LocalDate.of(2000, Month.DECEMBER, 29), 21));
    }
}
