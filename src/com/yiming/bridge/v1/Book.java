package com.yiming.bridge.v1;

/**
 * @Program: DesignPatterns
 * @Description:
 * @Author: YiMing
 * @Created: 2021/02/02 12:43
 */
public class Book extends Gift {

    @Override
    void gift() {
        System.out.println("given Book");
    }

}
