package com.yiming.state.v2;

/**
 * @Program: DesignPatterns
 * @Description:
 * @Author: YiMing
 * @Created: 2020/09/29 11:11
 */
public class HappyState extends MMState {
    @Override
    void smile() {
        System.out.println("Happy Smile");
    }

    @Override
    void cry() {
        System.out.println("Cry Smile");
    }

    @Override
    void say() {
        System.out.println("Say Smile");
    }
}
