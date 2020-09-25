package com.yiming.factorymethod;

/**
 * @Program: DesignPatterns
 * @Description:
 * @Author: YiMing
 * @Created: 2020/09/25 13:47
 */
public class CarFactory {
    public Movable createCar() {
        System.out.println("a car created!");
        return new Car();
    }
}
