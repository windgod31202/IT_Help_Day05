package com.example.dagger2_ithelp_day05.module;

import com.example.dagger2_ithelp_day05.teacher.Teacher;
import com.example.dagger2_ithelp_day05.teacher.TeacherNumber;

import dagger.Module;
import dagger.Provides;

@Module
public abstract class TeacherModule {
    @Provides
    static TeacherNumber provideTeacherNumber(){
        TeacherNumber teacherNumber = new TeacherNumber("1234567890");
        teacherNumber.getNumber();
        return teacherNumber;
    }

    @Provides
    static Teacher provideTeacher(TeacherNumber teacherNumber) {
        return new Teacher(teacherNumber);
    }

//    @Provides
//    static Teacher provideTeacher(){
//        return new Teacher();
//    }
}
