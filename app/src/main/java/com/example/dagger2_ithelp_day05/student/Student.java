package com.example.dagger2_ithelp_day05.student;

import android.util.Log;

import javax.inject.Inject;

public class Student {
    private static final String TAG = "Student";
    private StudentNumber studentNumber;

    @Inject
    public Student(StudentNumber studentNumber) {
        this.studentNumber = studentNumber;
        Log.e(TAG, "Student OK!");
    }

    public Student(){
        Log.e(TAG, "Student OK!");
    }

    public void study(){
        Log.e(TAG,"Student is studying");
    }
}
