package com.yiming.factorymethod;

/**
 * @Program: DesignPatterns
 * @Description: 简单工厂：可扩展性不好
 * @Author: YiMing
 * @Created: 2020/09/25 13:43
 */
public class SimpleVehicleFactory {

    public Car createCar() {
        //control....
        return new Car();
    }

    public Plane createPlane() {
        //control...
        return new Plane();
    }

    public Broom createBroom() {
        //control...
        return new Broom();
    }
}
