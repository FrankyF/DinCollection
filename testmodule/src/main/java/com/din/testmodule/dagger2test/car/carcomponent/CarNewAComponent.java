package com.din.testmodule.dagger2test.car.carcomponent;

import com.din.testmodule.dagger2test.car.CarNewA;

import dagger.Component;

@Component
public interface CarNewAComponent {
    void inject(CarNewA car);
}
