package com.din.testmodule.dagger2test.car;

import com.din.testmodule.dagger2test.base.BaseCar;
import com.din.testmodule.dagger2test.car.engine.Engine;
import com.din.testmodule.dagger2test.car.engine.Injection;

/**
 * Car类持有了对Engine实例的引用，我们称之为Car类对Engine类有一个依赖
 *
 * 接口注入：实现接口方法，同样以传参的方式实现注入。
 * */
public class Car2 extends BaseCar implements Injection<Engine> {
    private Engine engine;

    public Car2(){
    }

    @Override
    public void inject(Engine engine) {
        this.engine = engine;
    }
}
