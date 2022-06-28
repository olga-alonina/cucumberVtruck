package com.cydeo.step_defenitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    @Before
    public  void setup(){
        System.out.println("before scenario running");
    }
    @After

    public void tearDown(){
        System.out.println("After scenario running");
    }

}
