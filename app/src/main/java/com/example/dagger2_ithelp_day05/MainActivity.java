package com.example.dagger2_ithelp_day05;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.dagger2_ithelp_day05.dagger2.DaggerSchoolComponent;
import com.example.dagger2_ithelp_day05.dagger2.SchoolComponent;
import com.example.dagger2_ithelp_day05.school.School;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    EducationSystem educationSystem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SchoolComponent schoolComponent = DaggerSchoolComponent.create();

        schoolComponent.inject(this);
    }
}