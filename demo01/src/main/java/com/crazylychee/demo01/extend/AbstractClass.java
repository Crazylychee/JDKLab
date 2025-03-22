package com.crazylychee.demo01.extend;

abstract class  AbstractClass {

    public void abstractMethod() {

        System.out.println("AbstractClass");


    }

    public void abstractMethod(int a) {

        System.out.println("AbstractClass-a");


    }

    public void abstractMethod(int a, int b) {

        abstractMethod();

    }

}
