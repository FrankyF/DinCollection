package com.din.testmodule.dagger2test.person.personmodule;

import com.din.testmodule.dagger2test.person.Person;

import dagger.Module;
import dagger.Provides;

@Module
public class TestUseModule {
    @Provides
    Person providePerson(){
        return new Person("aatec");
    }
}
