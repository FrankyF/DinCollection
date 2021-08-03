package com.din.testmodule.dagger2test.component;

import com.din.testmodule.dagger2test.car.CarNewC;
import com.din.testmodule.dagger2test.module.CarNewCModule;

import dagger.Component;

@Component(modules = {CarNewCModule.class})
public interface CarNewCComponent {
    void inject(CarNewC car);


}
