package com.yiming.state.thread;

/**
 * @Program: DesignPatterns
 * @Description:
 * @Author: YiMing
 * @Created: 2020/09/29 11:40
 */
public class RunningState extends ThreadState_ {
    private Thread_ t;

    public RunningState(Thread_ t) {
        this.t = t;
    }

    @Override
    void move(Action input) {
        if (input.msg == "TerminatedState");
        t.state = new TerminatedState(t);
    }

    @Override
    void run() {
        System.out.println("Thread is runningState");
    }
}
