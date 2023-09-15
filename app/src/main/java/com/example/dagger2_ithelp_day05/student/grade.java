package com.example.dagger2_ithelp_day05.student;

import android.util.Log;

public class grade {
    private static final String TAG = "grade";
    private String grade;

    public grade(String grade) {
        this.grade = grade;
    }

    public void getGrade() {
        Log.e(TAG, "getGrade: "+grade);
    }
}
