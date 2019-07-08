package com.ishani.javaTraining;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Application {



        public static void main(String[] args) {

            WithoutStream();
            Stream();
            StreamLetter();
            Min();
            Max();
            MappingMarks();
            sortMapByMarks();
            sortMapByName();


        }

        public static void WithoutStream(){

            List<Student> studentList = Student.getAllStudent();
            System.out.println(studentList.size());

            List<Student> newStudent = new ArrayList<>();

            for(Student student : studentList){
                if (student.getMarks()>50){

                    newStudent.add(student);

                }
            }
            System.out.println("________________________");
            System.out.println(studentList.size());

            System.out.println(newStudent.size());
        }

        public static void Stream(){
            List<Student> students = Student.getAllStudent().stream().
                    filter(student -> student.getMarks()>50).collect(Collectors.toList());
            System.out.println(students.size());
        }

        public static void StreamLetter(){
            List<Student>students = Student.getAllStudent().stream().
                    filter(student -> student.getName().contains("i")).collect(Collectors.toList());
            System.out.println(students.size());
        }

        public static void Min(){
            Optional<Student> student = Student.getAllStudent().stream().min(Comparator.comparing(Student::getMarks));
            System.out.println(student);
        }

        public static void Max(){
            Optional<Student> student = Student.getAllStudent().stream().max(Comparator.comparing(Student::getMarks));
            System.out.println(student);
        }

        public static void MappingMarks(){

            Map<String,Double> result = Student.getAllStudent().stream().collect(Collectors.toMap(Student::getName,Student::getMarks));
            System.out.println(result);

        }

        public static void sortMapByMarks(){
            List<Student>students = Student.getAllStudent().stream().sorted(Comparator.comparing(Student::getMarks)).
                    map(student -> new Student(student.getName(),student.getMarks())).collect(Collectors.toList());
            System.out.println(students);

        }

    public static void sortMapByName(){
        List<Student>students = Student.getAllStudent().stream().sorted(Comparator.comparing(Student::getName)).
                map(student -> new Student(student.getName(),student.getMarks())).collect(Collectors.toList());
        System.out.println(students);

    }





}
