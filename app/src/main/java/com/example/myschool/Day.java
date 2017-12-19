package com.example.myschool;

import org.litepal.crud.DataSupport;

/**
 * Created by 德锐 on 2017/12/18.
 */

public class Day extends DataSupport {
    private String timename;
    private  int year;
    private  int day;
    private  int month;

    public String getTimename() {
        return timename;
    }

    public void setTimename(String timename) {
        this.timename = timename;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }
}
