package com.crazylychee.demo01.extend;

public class Tests {
    public static void main(String[] args) {
        Concreteclass c = new Concreteclass();
        c.abstractMethod(1,4);
    }
    //输出为
    // Concreteclass
    // AbstractClass  说明在子类重写继承了父类方法后，父类的方法就相当于永远被子类的方法取代。

}
