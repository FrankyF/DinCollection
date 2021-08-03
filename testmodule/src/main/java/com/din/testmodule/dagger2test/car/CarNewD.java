package com.din.testmodule.dagger2test.car;

import com.din.testmodule.dagger2test.base.BaseCar;
import com.din.testmodule.dagger2test.car.engine.EngineB;
import com.din.testmodule.dagger2test.component.DaggerCarNewDComponent;
import com.din.testmodule.dagger2test.module.CarNewDModule;

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
public class CarNewD extends BaseCar {
    @Inject
    EngineB engine1;
    @Inject
    EngineB engine2;

    public CarNewD(){
        DaggerCarNewDComponent
                .builder()

                .carNewDModule(new CarNewDModule())

                .build().inject(this);
    }

    public EngineB getEngineB1() {
        return this.engine1;
    }
    public EngineB getEngineB2() {
        return this.engine2;
    }
}
