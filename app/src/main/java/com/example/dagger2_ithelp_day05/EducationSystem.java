package com.example.dagger2_ithelp_day05;

import android.util.Log;

import com.example.dagger2_ithelp_day05.school.School;
import com.example.dagger2_ithelp_day05.student.Student;
import com.example.dagger2_ithelp_day05.teacher.Teacher;

import javax.inject.Inject;

public class EducationSystem {
    private static final String TAG = "EducationSystem";
    private School school;
    private Student student;
    private Teacher teacher;

    @Inject
    public EducationSystem(School school, Student student, Teacher teacher) {
        this.school = school;
        this.student = student;
        this.teacher = teacher;
        Log.e(TAG, "EducationSystem: \n" +
                "school: " + school + "\n" +
                "student: " + student + "\n" +
                "teacher: " + teacher + "\n" +
                "Prepare OK!");
    }

    public void start(){
        school.buildSchoolType();
        Log.e(TAG, "start OK!");
    }
}
