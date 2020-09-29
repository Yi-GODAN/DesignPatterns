package com.yiming.state.thread;

/**
 * @Program: DesignPatterns
 * @Description:
 * @Author: YiMing
 * @Created: 2020/09/29 11:35
 */
public class NewState extends ThreadState_ {
    private Thread_ t;

    public NewState(Thread_ t) {
        this.t = t;
    }

    @Override
    void move(Action input) {
        if (input.msg == "start") {
            t.state = new RunningState(t);
        }
    }

    @Override
    void run() {
        System.out.println("Thread is new state");
    }
}
