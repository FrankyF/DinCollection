package com.din.testmodule.dagger2test.car.engine;

import javax.inject.Inject;

public class Engine {
    @Inject

    public Engine(){}

    public void run(){
        System.out.println("引擎转起来了~~~");
    }
}
