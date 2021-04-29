package com.example.onlineregistration;

public class Student {
    private int id;
    private String fullName;
    private String email;
    private String phone;
    private String studentNumber;
    private String password;

    public Student() {
    }

    public Student(String fullName, String email, String phone, String studentNumber, String password) {
        this.fullName = fullName;
        this.email = email;
        this.phone = phone;
        this.studentNumber = studentNumber;
        this.password = password;
    }

    public Student(int id, String fullName, String email, String phone, String studentNumber, String password) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.phone = phone;
        this.studentNumber = studentNumber;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", studentNumber='" + studentNumber + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
