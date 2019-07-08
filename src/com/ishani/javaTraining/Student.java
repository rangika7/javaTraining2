package com.ishani.javaTraining;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


public class Student {


        private String name;
        private double marks;


        public Student(String n, double m) {
            this.setName(n);
            this.setMarks(m);
        }


        public static List<Student> getAllStudent() {
            List<Student> studentList = new ArrayList<>();
            studentList.add(new Student("Madhee", 60));
            studentList.add(new Student("Akila", 55));
            studentList.add(new Student("Nipuni", 80));
            studentList.add(new Student("Kamal", 75));
            studentList.add(new Student("Sandun", 98));
            studentList.add(new Student("Koshila", 32));
            studentList.add(new Student("Tharaka", 68));
            studentList.add(new Student("Piyumi", 85));
            studentList.add(new Student("Thilan", 40));
            studentList.add(new Student("Ruwan", 90));

            return studentList;

        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getMarks() {
            return marks;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", marks=" + marks +
                    '}';
        }

        public void setMarks(double marks) {
            this.marks = marks;
        }
    }


