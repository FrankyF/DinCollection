package com.din.testmodule.dagger2test;

import com.din.testmodule.dagger2test.person.Person;

import javax.inject.Inject;

public class TestRun {

    @Inject
    public static  Person person;


    public static void main(String[] args) {
        initPer();
    }

    public static void  initPer(){
        System.out.println(person.toString());
    }

}
