package com.yiming.state.v3;

/**
 * @Program: DesignPatterns
 * @Description:
 * @Author: YiMing
 * @Created: 2020/09/29 12:02
 */
public class Main3 {

    public static void main(String[] args) {
        Car c = new Car();
        CarState cs = new OpenState();
        cs.stop();
    }
}
