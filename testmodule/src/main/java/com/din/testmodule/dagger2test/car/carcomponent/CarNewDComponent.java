package com.din.testmodule.dagger2test.car.carcomponent;

import com.din.testmodule.dagger2test.annotation.CarScope;
import com.din.testmodule.dagger2test.car.CarNewD;
import com.din.testmodule.dagger2test.car.carmodule.CarNewDModule;

import dagger.Component;
@CarScope
@Component(modules = {CarNewDModule.class})
public interface CarNewDComponent {
    void inject(CarNewD car);


}
