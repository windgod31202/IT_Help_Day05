package com.example.dagger2_ithelp_day05.school;

import android.util.Log;

import javax.inject.Inject;

public class Independent_School implements School {
    // 私立學校
    private static final String TAG = "Independent_School";

    @Inject
    public Independent_School() {
    }

    @Override
    public void buildSchoolType() {
        Log.e(TAG, "buildSchoolType: "+ TAG );
    }
}
