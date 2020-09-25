package com.yiming.factorymethod;

/**
 * @Program: DesignPatterns
 * @Description:
 * @Author: YiMing
 * @Created: 2020/09/25 13:27
 */
public class Car implements Movable{

    @Override
    public void go() {
        System.out.println("Car go Wuwuwuwuwuwuwu...");
    }
}
