package com.din.testmodule.dagger2test.person.personcomponent;

import com.din.testmodule.dagger2test.person.Person;
import com.din.testmodule.dagger2test.person.personmodule.PersonModule;

import dagger.Component;

@Component(modules = {PersonModule.class})
public interface PersonComponent {
    void inject(Person person);
}
