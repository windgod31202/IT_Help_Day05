package com.example.dagger2_ithelp_day05.module;

import com.example.dagger2_ithelp_day05.school.School;
import com.example.dagger2_ithelp_day05.school.State_School;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class StateSchoolModule {

    @Binds
    abstract School bindStateSchool(State_School state_school);
}
