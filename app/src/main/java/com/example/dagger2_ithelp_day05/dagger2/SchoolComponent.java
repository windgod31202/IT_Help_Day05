package com.example.dagger2_ithelp_day05.dagger2;

import com.example.dagger2_ithelp_day05.MainActivity;
import com.example.dagger2_ithelp_day05.module.IndependentSchoolModule;
import com.example.dagger2_ithelp_day05.module.StateSchoolModule;
import com.example.dagger2_ithelp_day05.module.StudentModule;
import com.example.dagger2_ithelp_day05.module.TeacherModule;
import com.example.dagger2_ithelp_day05.school.School;

import dagger.Component;

@Component(modules = {StudentModule.class,
                    TeacherModule.class,
                    StateSchoolModule.class})
public interface SchoolComponent {
    School getSchool();
    void inject(MainActivity mainActivity);
}
