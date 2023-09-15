package com.example.dagger2_ithelp_day05.student;

import android.util.Log;

public class StudentNumber {
    private String number;

    public StudentNumber(String number) {
        this.number = number;
    }

    public void getNumber() {
        Log.e("TAG", "getNumber: 1234567890" );
    }
}
