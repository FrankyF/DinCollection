package com.din.testmodule.dagger2test.person.personmodule;

import com.din.testmodule.dagger2test.person.idcard.Idcard;

import dagger.Module;
import dagger.Provides;

@Module
public class PersonModule {
    public PersonModule() {

    }

    @Provides
    Idcard provideIdcard() {
      return new Idcard("111", "1222");
    }

}
