package com.yiming.state.thread;

/**
 * @Program: DesignPatterns
 * @Description:
 * @Author: YiMing
 * @Created: 2020/09/29 11:26
 */
public class Thread_ {

    ThreadState_ state;

    void move(Action input) {state.move(input);}

    void run() {state.run();}
}
