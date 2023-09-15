package com.example.dagger2_ithelp_day05;

import android.util.Log;

import com.example.dagger2_ithelp_day05.director.Director;
import com.example.dagger2_ithelp_day05.school.School;
import com.example.dagger2_ithelp_day05.student.Student;
import com.example.dagger2_ithelp_day05.teacher.Teacher;

import javax.inject.Inject;

public class EducationSystem {
    private static final String TAG = "EducationSystem";
    private School school;
    private Student student;
    private Teacher teacher;
    private Director director;

    @Inject
    public EducationSystem(School school, Student student, Teacher teacher, Director director) {
        this.school = school;
        this.student = student;
        this.teacher = teacher;
        this.director = director;
    }

    public void start(){
        school.buildSchoolType();
        Log.e(TAG, "EducationSystem: \n" +
                "school: " + school + "\n" +
                "director: " + director + "\n" +
                "teacher: " + teacher + "\n" +
                "student: " + student + "\n" +
                "Prepare OK!");
    }
}
