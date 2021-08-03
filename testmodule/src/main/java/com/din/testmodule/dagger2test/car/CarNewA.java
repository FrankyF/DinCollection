package com.din.testmodule.dagger2test.car;

import com.din.testmodule.dagger2test.base.BaseCar;
import com.din.testmodule.dagger2test.car.engine.Engine;
import com.din.testmodule.dagger2test.component.DaggerCarNewAComponent;

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
public class CarNewA extends BaseCar {

    @Inject
    Engine engine;

    public CarNewA(){
        DaggerCarNewAComponent
                .builder()

                .build().inject(this);
    }
    public Engine getEngine() {
        return this.engine;
    }
}
