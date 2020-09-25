package com.yiming.abstractfactory;

/**
 * @Program: DesignPatterns
 * @Description:
 * @Author: YiMing
 * @Created: 2020/09/25 13:28
 */
public class Main {

    public static void main(String[] args) {
        AbstractFactory f = new ModernFactory();
        AbstractFactory m = new MagicFactory();

        Vehicle c = f.createVehicle();
        c.go();
        Vehicle b = m.createVehicle();
        b.go();
        Weapon a = f.createWeapon();
        a.shoot();
        Weapon ms = m.createWeapon();
        ms.shoot();
        Food bread = f.createFood();
        bread.printName();
        Food mu = m.createFood();
        mu.printName();
    }
}
