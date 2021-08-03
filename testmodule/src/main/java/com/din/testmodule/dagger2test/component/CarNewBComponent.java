package com.din.testmodule.dagger2test.component;

import com.din.testmodule.dagger2test.car.CarNewB;
import com.din.testmodule.dagger2test.module.CarNewBModule;

import dagger.Component;

@Component(modules = {CarNewBModule.class})
public interface CarNewBComponent {
    void inject(CarNewB car);


}
