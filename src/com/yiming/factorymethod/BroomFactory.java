package com.yiming.factorymethod;

/**
 * @Program: DesignPatterns
 * @Description:
 * @Author: YiMing
 * @Created: 2020/09/25 13:51
 */
public class BroomFactory {
    public Movable create() {
        System.out.println("a broom created!");
        return new Broom();
    }
}
