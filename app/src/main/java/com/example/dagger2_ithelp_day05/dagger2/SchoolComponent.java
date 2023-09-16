package com.example.dagger2_ithelp_day05.dagger2;

import com.example.dagger2_ithelp_day05.MainActivity;
import com.example.dagger2_ithelp_day05.module.IndependentSchoolModule;
import com.example.dagger2_ithelp_day05.module.StateSchoolModule;
import com.example.dagger2_ithelp_day05.module.StudentModule;
import com.example.dagger2_ithelp_day05.module.TeacherModule;
import com.example.dagger2_ithelp_day05.school.School;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;

@Singleton
@Component(modules = {StudentModule.class,
                    TeacherModule.class,
                    StateSchoolModule.class})
public interface SchoolComponent {
    School getSchool();
    void inject(MainActivity mainActivity);

    @Component.Builder
    interface Builder{
        @BindsInstance
        Builder score(@Named("score") int score);

        @BindsInstance
        Builder worldRanking(@Named("worldRanking") int worldRanking);

        @BindsInstance
        Builder name(String name);

        SchoolComponent build();
    }
}
