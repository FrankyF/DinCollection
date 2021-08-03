package com.din.testmodule.dagger2test.car;

import com.din.testmodule.dagger2test.annotation.QualifierA;
import com.din.testmodule.dagger2test.annotation.QualifierB;
import com.din.testmodule.dagger2test.base.BaseCar;
import com.din.testmodule.dagger2test.car.carcomponent.DaggerCarNewCComponent;
import com.din.testmodule.dagger2test.car.carmodule.CarNewCModule;
import com.din.testmodule.dagger2test.car.engine.EngineB;

import javax.inject.Inject;

/**
 * Car类持有了对Engine实例的引用，我们称之为Car类对Engine类有一个依赖
 *
 * 注解注入：使用Java注解在编译阶段生成代码实现注入或者是在运行阶段通过反射实现注入。
 *
 *
 *
 *
 *
 * */
public class CarNewC extends BaseCar {
    @QualifierA
    @Inject
    EngineB engine1;

    @QualifierB
    @Inject
    EngineB engine2;

    public CarNewC(){
        DaggerCarNewCComponent
                .builder()

                .carNewCModule(new CarNewCModule())

                .build().inject(this);
    }
    public EngineB getEngineB1() {
        return this.engine1;
    }
    public EngineB getEngineB2() {
        return this.engine2;
    }
}
