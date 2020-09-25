package com.yiming.factorymethod;

/**
 * @Program: DesignPatterns
 * @Description:
 * @Author: YiMing
 * @Created: 2020/09/25 13:49
 */
public class PlaneFactory {
    public Movable create() {
        System.out.println("a plane created!");
        return new Plane();
    }
}
