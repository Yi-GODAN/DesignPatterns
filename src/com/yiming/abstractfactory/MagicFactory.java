package com.yiming.abstractfactory;

/**
 * @Program: DesignPatterns
 * @Description:
 * @Author: YiMing
 * @Created: 2020/09/25 16:49
 */
public class MagicFactory extends AbstractFactory {

    @Override
    Food createFood() {
        return new MushRoom();
    }

    @Override
    Weapon createWeapon() {
        return new MagicStick();
    }

    @Override
    Vehicle createVehicle() {
        return new Broom();
    }
}
