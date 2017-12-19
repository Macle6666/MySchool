package com.example.myschool;

import org.litepal.crud.DataSupport;

import java.io.Serializable;

/**
 * Created by 德锐 on 2017/12/13.
 */

public class Crouse  extends DataSupport{
    private String courseName;
    private String teacher;
    private String classRoom;
    private int day;
    private int start;
    private int end;



    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(String classRoom) {
        this.classRoom = classRoom;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }
}
