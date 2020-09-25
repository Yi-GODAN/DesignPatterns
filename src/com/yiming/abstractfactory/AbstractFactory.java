package com.yiming.abstractfactory;

/**
 * @Program: DesignPatterns
 * @Description:
 * @Author: YiMing
 * @Created: 2020/09/25 16:39
 */
public abstract class AbstractFactory {
    abstract Food createFood();
    abstract Weapon createWeapon();
    abstract Vehicle createVehicle();
}
