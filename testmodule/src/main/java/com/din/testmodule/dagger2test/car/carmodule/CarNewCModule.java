package com.din.testmodule.dagger2test.car.carmodule;

import com.din.testmodule.dagger2test.car.engine.EngineB;
import com.din.testmodule.dagger2test.annotation.QualifierA;
import com.din.testmodule.dagger2test.annotation.QualifierB;

import dagger.Module;
import dagger.Provides;

@Module
public class CarNewCModule {
    public CarNewCModule(){ }

    @QualifierA
    @Provides
    EngineB provideEngineB1(){
        return new EngineB("QualifierA");
    }
    @QualifierB
    @Provides
    EngineB provideEngineB2(){
        return new EngineB("QualifierB");
    }
}
