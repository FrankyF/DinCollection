package com.din.testmodule.dagger2test.car.carmodule;

import com.din.testmodule.dagger2test.annotation.CarScope;
import com.din.testmodule.dagger2test.car.engine.EngineB;

import dagger.Module;
import dagger.Provides;

@Module
public class CarNewDModule {
    public CarNewDModule(){ }

    @CarScope
    @Provides
    EngineB provideEngine(){
        return new EngineB("CarNewD  EngineB");
    }
}
