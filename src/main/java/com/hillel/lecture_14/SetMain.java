package com.hillel.lecture_14;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetMain {

    public static void main(String[] args) {
        Set<Student> stringSet = findAllStudents();
        System.out.println("StringSet: " + stringSet.size());

        List<Student> studentList = findAllStudentsList();
        System.out.println("studentList: "+ studentList.size());
//        students.addAll(studentList);

        Set<Student> students = new HashSet<>(studentList);
        System.out.println("no duplicates: "+ students.size());

//        for (Student student : stringSet) {
//            System.out.println(student.toString());
//        }

    }

     public static Set<Student> findAllStudents() {
        Student studentMarina = new Student("Marina", 10, 30);
        Student studentVictor = new Student("Victor", 8, 25);
        Student studentAnna = new Student("Anna", 6, 35);
        Student studentBob = new Student("Bob", 2, 27);
        Student studentBob2 = new Student("Bob", 2, 27);
        Student studentVictor1 = new Student("Victor", 8, 25);

        Set<Student> students = new HashSet<>();
        students.add(studentMarina);
        students.add(studentVictor);
        students.add(studentAnna);
        students.add(studentBob);
        students.add(studentBob2);
        students.add(studentVictor1);

        return students;

        }

    public static List<Student> findAllStudentsList() {
        Student studentMarina = new Student("Marina", 10, 30);
        Student studentVictor = new Student("Victor", 8, 25);
        Student studentAnna = new Student("Anna", 6, 35);
        Student studentBob = new Student("Bob", 2, 26);
        Student studentAnna1 = new Student("Anna", 6, 35);
        Student studentVictor1 = new Student("Victor", 8, 25);

//        ArrayList<Student> students = new ArrayList<>();
//        students.add(studentMarina);
//        students.add(studentVictor);
//        students.add(studentAnna);
//        students.add(studentBob);

        return Arrays.asList(studentMarina,studentVictor, studentAnna, studentBob);

    }

}


