package src.m3_oop_inherit_debug_access_modifiers_employee_student_arithmetic.homework.task3;

import java.util.Date;

public class Course {
    private Date startDate;
    private String name;
    private int hourDuration;
    private String teacherName;

    public Course(String name, Date startDate) {
        this.name = name;
        this.startDate = startDate;
    }

    public Course(int hourDuration, String name, String teacherName) {
        this.hourDuration = hourDuration;
        this.name = name;
        this.teacherName = teacherName;
    }


    public Date getStartDate() {
        return startDate;
    }

    public String getName() {
        return name;
    }

    public int getHourDuration() {
        return hourDuration;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHourDuration(int hourDuration) {
        this.hourDuration = hourDuration;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }
}
