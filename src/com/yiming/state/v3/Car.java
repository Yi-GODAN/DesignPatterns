package com.yiming.state.v3;

/**
 * @Program: DesignPatterns
 * @Description:
 * @Author: YiMing
 * @Created: 2020/09/29 11:52
 */
public class Car {
    CarState state;

    public void openTheDoor() {
        state.open();
    }

    public void closeTheDoor() {
        state.closed();
    }

    public void runTheCar() {
        state.running();
    }

    public void stopTheCar() {
        state.stop();
    }
}
