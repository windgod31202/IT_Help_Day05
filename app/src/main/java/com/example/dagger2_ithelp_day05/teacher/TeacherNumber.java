package com.example.dagger2_ithelp_day05.teacher;

import android.util.Log;

public class TeacherNumber {
    private String number;

    public TeacherNumber(String number) {
        this.number = number;
    }

    public void getNumber() {
        Log.e("TAG", "getNumber: "+number);
    }
}
