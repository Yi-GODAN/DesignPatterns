package com.yiming.state.thread;

/**
 * @Program: DesignPatterns
 * @Description:
 * @Author: YiMing
 * @Created: 2020/09/29 11:27
 */
public abstract class ThreadState_ {
    abstract void move(Action input);
    abstract void run();
}
