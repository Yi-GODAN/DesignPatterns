package com.yiming.factorymethod;

/**
 * @Program: DesignPatterns
 * @Description:
 * @Author: YiMing
 * @Created: 2020/09/25 13:36
 */
public class Broom implements Movable {

    @Override
    public void go() {
        System.out.println("Broom fly xiuxiuxiu....");
    }
}
