package com.din.testmodule.dagger2test.car;

import com.din.testmodule.dagger2test.base.BaseCar;
import com.din.testmodule.dagger2test.car.engine.Engine;
import com.din.testmodule.dagger2test.car.engine.Wheel;

import java.util.List;

/**
 * Car类持有了对Engine实例的引用，我们称之为Car类对Engine类有一个依赖
 *
 * 构造注入：通过构造函数传参给依赖的成员变量赋值，从而实现注入。
 * */
public class Car1 extends BaseCar {
    private Engine engine;
    private List<Wheel> wheels;

    public Car1(Engine engine, List<Wheel> wheels){
        this.engine = engine;
        this.wheels = wheels;
    }

}
