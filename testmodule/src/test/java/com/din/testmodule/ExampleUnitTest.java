package com.din.testmodule;

import org.junit.Test;

import static org.junit.Assert.*;

import com.din.testmodule.dagger2test.car.Car0;
import com.din.testmodule.dagger2test.car.Car1;
import com.din.testmodule.dagger2test.car.CarNewB;
import com.din.testmodule.dagger2test.car.CarNewC;
import com.din.testmodule.dagger2test.car.CarNewD;
import com.din.testmodule.dagger2test.car.engine.Engine;
import com.din.testmodule.dagger2test.car.engine.Wheel;

import java.util.ArrayList;
import java.util.List;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
        assertEquals(4, 2 + 2);

    }
    @Test
    public void test0() {
        Car0 car = new Car0();
        car.start();
    }


    @Test
    public void test1() {
        Engine engine = new Engine();
        List<Wheel> wheels = new ArrayList<>();
        for(int i = 0; i < 4; i++){
            wheels.add(new Wheel());
        }
        Car1 car = new Car1(engine, wheels);
        car.start();
    }
    @Test
    public void test3() {

        CarNewB car = new CarNewB();
        car.getEngine().run();

    }
    @Test
    public void test4() {

        CarNewC car = new CarNewC();
        car.getEngineB1().run();
        car.getEngineB2().run();

    }
    @Test
    public void test5() {

        CarNewD car = new CarNewD();
        System.out.println(car.getEngineB1().hashCode());
        System.out.println(car.getEngineB2().hashCode());
    }
}