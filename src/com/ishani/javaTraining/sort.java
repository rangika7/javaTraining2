package com.ishani.javaTraining;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class sort {

    public static void main(String[] args) {

        List<Student> studentList = Student.getAllStudent().stream().sorted(Comparator.comparing(Student::getName))
                .collect(Collectors.toList());
        System.out.println(studentList);

        //List<Student> studentList2 = Student.getAllStudent().stream().sorted()

        Optional<Student> student = Student.getAllStudent().stream().max(Comparator.comparing(Student::getMarks));
        System.out.println(student);

    }

}
