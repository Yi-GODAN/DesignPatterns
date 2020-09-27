package com.yiming.observer.v3;

/**
 * @Program: DesignPatterns
 * @Description: 加入观察者
 * @Author: YiMing
 * @Created: 2020/09/27 19:21
 */
class Child{
    private boolean cry = false;
    private Dad d = new Dad();

    public boolean isCry() {
        return cry;
    }

    public void wakeUp() {
        cry = true;
        d.feed();
    }
}

class Dad {
    public void feed() {
        System.out.println("dad feeding...");
    }
}

public class Main3 {
    public static void main(String[] args) {
        Child c = new Child();
        // do sth
        c.wakeUp();
    }
}
