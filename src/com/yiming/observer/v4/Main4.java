package com.yiming.observer.v4;

/**
 * @Program: DesignPatterns
 * @Description: 加入多个观察者
 * @Author: YiMing
 * @Created: 2020/09/27 19:24
 */
class Child {
    private boolean cry = false;
    private Dad dad = new Dad();
    private Mum mum = new Mum();
    private Dog dog = new Dog();

    public void wakeUp() {
        cry = true;
        dad.feed();
        dog.wang();
        mum.hug();
    }
}

class Dad {
    public void feed() {
        System.out.println("dad feeding...");
    }
}

class Mum {
    public void hug() {
        System.out.println("mum hugging...");
    }
}

class Dog {
    public void wang() {
        System.out.println("dog wang...");
    }
}

public class Main4 {
    public static void main(String[] args) {
        Child c = new Child();
        // do sth
        c.wakeUp();
    }
}
