package com.example.a3pract;

import java.io.Serializable;

public class Student implements Serializable {
    private String first_name, second_name, group;
    private int grade;


    public Student(String first_name, String second_name, String group, int grade)
    {
        this.first_name = first_name;
        this.second_name = second_name;
        this.group = group;
        this.grade = grade;
    }

    public String getFirst_name() {
        return first_name;
    }

    public int getGrade() {
        return grade;
    }

    public String getGroup() {
        return group;
    }

    public String getSecond_name() {
        return second_name;
    }
}
