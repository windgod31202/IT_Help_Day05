package com.example.dagger2_ithelp_day05.school;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Named;

public class State_School implements School{
    // 公立&國立學校\
    private static final String TAG = "State_School";
    private int score;
    private String name;
    private int worldRanking;

    @Inject
    public State_School(@Named("score") int score, String name, @Named("worldRanking")  int worldRanking) {
        this.score = score;
        this.name = name;
        this.worldRanking = worldRanking;
    }

    @Override
    public void buildSchoolType() {
        Log.e(TAG, "buildSchoolType: "+TAG+"\nscore: "+score+"\nname: "+name+"\nworldRanking: "+worldRanking);

    }
}
