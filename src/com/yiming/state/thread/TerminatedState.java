package com.yiming.state.thread;

/**
 * @Program: DesignPatterns
 * @Description:
 * @Author: YiMing
 * @Created: 2020/09/29 11:42
 */
public class TerminatedState extends ThreadState_ {
    private Thread_ t;

    public TerminatedState(Thread_ t) {
        this.t = t;
    }

    @Override
    void move(Action input) {
        if (input.msg == "close") {
            System.out.println("thread closing... ");
        }
    }

    @Override
    void run() {
        System.out.println("thread is terminated");
    }
}
