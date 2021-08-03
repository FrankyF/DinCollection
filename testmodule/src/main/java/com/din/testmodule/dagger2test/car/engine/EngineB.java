package com.din.testmodule.dagger2test.car.engine;

public class EngineB {
    public  String name;
    public EngineB(String name){
        this.name= name;
        System.out.println(name+" INIT");
    }

    public void run(){
        System.out.println(name+" 引擎转起来了~~~");
    }



}
