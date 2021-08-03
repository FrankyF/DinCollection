package com.din.testmodule.dagger2test.car.carcomponent;

import com.din.testmodule.dagger2test.car.CarNewB;
import com.din.testmodule.dagger2test.car.carmodule.CarNewBModule;

import dagger.Component;

@Component(modules = {CarNewBModule.class})
public interface CarNewBComponent {
    void inject(CarNewB car);


}
