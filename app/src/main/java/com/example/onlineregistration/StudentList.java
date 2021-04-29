package com.example.onlineregistration;

import java.util.ArrayList;
import java.util.List;

public class StudentList {

    private List<Student> studentList;

    public StudentList(){
        studentList = new ArrayList<>();
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public void addStudent(Student student){
        studentList.add(student);
    }
}
