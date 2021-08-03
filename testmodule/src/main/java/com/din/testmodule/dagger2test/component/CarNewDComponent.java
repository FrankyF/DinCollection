package com.din.testmodule.dagger2test.component;

import com.din.testmodule.dagger2test.annotation.CarScope;
import com.din.testmodule.dagger2test.car.CarNewD;
import com.din.testmodule.dagger2test.module.CarNewDModule;

import dagger.Component;
@CarScope
@Component(modules = {CarNewDModule.class})
public interface CarNewDComponent {
    void inject(CarNewD car);


}
