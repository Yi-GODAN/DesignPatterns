package com.yiming.state.v3;

/**
 * @Program: DesignPatterns
 * @Description:
 * @Author: YiMing
 * @Created: 2020/09/29 11:59
 */
public class OpenState extends CarState {
    @Override
    void open() {
        System.out.println("opening the door");
    }

    @Override
    void closed() {
        System.out.println("close the door...");
    }

    @Override
    void running() {
        System.out.println("Don't running the car");
    }

    @Override
    void stop() {
        System.out.println("Don't stop the car");
    }
}
