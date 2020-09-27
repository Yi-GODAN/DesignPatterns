package com.yiming.observer.v2;

/**
 * @Program: DesignPatterns
 * @Description: 面向对象之傻等
 * @Author: YiMing
 * @Created: 2020/09/27 19:17
 */
class Child {
    private boolean cry = false;

    public boolean isCry() {
        return cry;
    }

    public void wakeUp() {
        System.out.println("Waked Up! Crying wuwuwuwuwu....");
        cry = true;
    }
}

public class Main2 {
    public static void main(String[] args) {
        Child child = new Child();
        while (!child.isCry()) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("observing...");
        }
    }
}
