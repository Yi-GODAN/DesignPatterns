package com.yiming.factorymethod;

/**
 * @Program: DesignPatterns
 * @Description:
 * @Author: YiMing
 * @Created: 2020/09/25 13:31
 */
public class Plane implements Movable{

    @Override
    public void go() {
        System.out.println("plane fly sooooo...");
    }
}
