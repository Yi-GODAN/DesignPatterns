package com.yiming.state.v3;

/**
 * @Program: DesignPatterns
 * @Description:
 * @Author: YiMing
 * @Created: 2020/09/29 11:52
 */
public abstract class CarState {
    abstract void open();
    abstract void closed();
    abstract void running();
    abstract void stop();
}
