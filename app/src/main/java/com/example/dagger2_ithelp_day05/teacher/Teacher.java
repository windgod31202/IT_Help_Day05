package com.example.dagger2_ithelp_day05.teacher;

import android.util.Log;

import javax.inject.Inject;

public class Teacher {
    private static final String TAG = "Teacher";
    private TeacherNumber teacherNumber;

    @Inject
    public Teacher(TeacherNumber teacherNumber) {
        this.teacherNumber = teacherNumber;
        Log.e(TAG, "Teacher OK!");
    }

    public Teacher(){
        Log.e(TAG, "Teacher OK!");
    }

    public void teach(){
        Log.e(TAG, "Teacher is teaching");
    }

}
