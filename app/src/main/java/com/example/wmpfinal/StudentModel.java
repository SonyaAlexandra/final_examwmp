package com.example.wmpfinal;

public class StudentModel {
    public String name;
    public String email;
    public int credits;

    // Default constructor required for Firebase
    public StudentModel() {
    }

    public StudentModel(String name, String email, int credits) {
        this.name = name;
        this.email = email;
        this.credits = credits;
    }
}
