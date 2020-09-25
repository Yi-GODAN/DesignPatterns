package com.yiming.factorymethod;

/**
 * @Program: DesignPatterns
        * @Description:
        * @Author: YiMing
        * @Created: 2020/09/25 13:28
        */
public class Main {

    public static void main(String[] args) {
        Movable m = new BroomFactory().create();
        m.go();
    }
}
