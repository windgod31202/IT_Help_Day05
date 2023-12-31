package com.example.dagger2_ithelp_day05;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.dagger2_ithelp_day05.dagger2.DaggerSchoolComponent;
import com.example.dagger2_ithelp_day05.dagger2.SchoolComponent;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    EducationSystem educationSystem01, educationSystem02;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SchoolComponent schoolComponent = DaggerSchoolComponent.builder()
                .score(500)
                .name("國立台中科技大學")
                .worldRanking(3415)
                .build();

        schoolComponent.inject(this);

        educationSystem01.start();
        educationSystem02.start();
    }
}