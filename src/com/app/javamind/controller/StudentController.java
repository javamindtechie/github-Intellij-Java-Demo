package com.app.javamind.controller;

public class StudentController {
    String stdentName;
    int studentId;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStdentName() {
        return stdentName;
    }

    public void setStdentName(String stdentName) {
        this.stdentName = stdentName;
    }


    public StudentController(String stdentName, int studentId) {
        this.stdentName = stdentName;
        this.studentId = studentId;
    }



}
