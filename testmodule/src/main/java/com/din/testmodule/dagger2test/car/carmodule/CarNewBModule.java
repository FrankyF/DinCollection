package com.din.testmodule.dagger2test.car.carmodule;

import com.din.testmodule.dagger2test.car.engine.EngineB;

import dagger.Module;
import dagger.Provides;

@Module
public class CarNewBModule {
    public CarNewBModule(){ }
    @Provides
    EngineB provideEngine(){
        return new EngineB("SDSD");
    }
}
