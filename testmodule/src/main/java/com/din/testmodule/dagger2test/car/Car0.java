package com.din.testmodule.dagger2test.car;

import com.din.testmodule.dagger2test.base.BaseCar;
import com.din.testmodule.dagger2test.car.engine.Engine;
import com.din.testmodule.dagger2test.car.engine.Wheel;

import java.util.List;

/**
 * Car类持有了对Engine实例的引用，我们称之为Car类对Engine类有一个依赖
 *
 * 丧失了灵活性，一切依赖都是在Car类的内部创建
 * Car与Engine和Wheel严重耦合
 *
 * 创建方式发生了改变，我们就必须要去修改Car类的构造函数 构造函数改变了 没办法替换动态的替换依赖实例
 *
 * */
public class Car0 extends BaseCar {
    private Engine engine;
    private List<Wheel> wheels;

    public Car0(){
//        engine = new Engine();
//        for(int i = 0; i < 4; i++){
//            wheels = new ArrayList<>();
//            wheels.add(new Wheel());
//        }
    }

}
