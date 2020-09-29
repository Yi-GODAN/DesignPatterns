package com.yiming.state.v3;

/**
 * @Program: DesignPatterns
 * @Description:
 * @Author: YiMing
 * @Created: 2020/09/29 12:07
 */
public class StopState extends CarState {
    @Override
    void open()   {
        System.out.println("Don't open the door");
    }

    @Override
    void closed()    {
        System.out.println("closing the door");
    }

    @Override
    void running()   {
        System.out.println("running the car....");
    }

    @Override
    void stop()   {
        System.out.println("stopping the car");
    }
}
