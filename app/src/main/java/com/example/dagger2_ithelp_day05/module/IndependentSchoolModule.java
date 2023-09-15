package com.example.dagger2_ithelp_day05.module;

import com.example.dagger2_ithelp_day05.school.Independent_School;
import com.example.dagger2_ithelp_day05.school.School;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class IndependentSchoolModule {

    @Binds
    abstract School bindIndependentSchool(Independent_School independent_school);

}
