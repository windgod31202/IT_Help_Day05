package com.example.dagger2_ithelp_day05.school;

import android.util.Log;

import javax.inject.Inject;

public class State_School implements School{
    // 公立&國立學校

    private static final String TAG = "State_School";

    @Inject
    public State_School() {
        Log.e(TAG, "State_School OK!");
    }

    @Override
    public void buildSchoolType() {
        Log.e(TAG, "buildSchoolType: "+TAG);

    }
}
