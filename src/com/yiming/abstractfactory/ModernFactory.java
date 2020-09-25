package com.yiming.abstractfactory;

/**
 * @Program: DesignPatterns
 * @Description:
 * @Author: YiMing
 * @Created: 2020/09/25 16:49
 */
public class ModernFactory extends AbstractFactory {

    @Override
    Food createFood() {
        return new Bread();
    }

    @Override
    Weapon createWeapon() {
        return new AK47();
    }

    @Override
    Vehicle createVehicle() {
        return new Car();
    }
}
