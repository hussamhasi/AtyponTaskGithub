package com.company;

import java.util.ArrayList;
import java.util.List;

public class UniversityCourse {
    private List<String> students =new ArrayList<>();
    private String course;
    private String instructor;

    UniversityCourse(String courseName,String instructorName){
        this.course=courseName;
        this.instructor=instructorName;
    }

    public void register(String studentName){
        students.add(studentName);
    }
    public void drop(String studentName){
        students.remove(studentName);
    }
    public Boolean isRegistered(String studentName){
        return students.indexOf(studentName) != -1;
    }

}
