package com.din.testmodule.dagger2test.person.personcomponent;

import com.din.testmodule.TestActivity;

import dagger.Component;

@Component
public interface TestUseComponent {
    void  inject(TestActivity activity);
}
