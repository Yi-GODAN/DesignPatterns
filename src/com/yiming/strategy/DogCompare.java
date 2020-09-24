package com.yiming.strategy;

/**
 * @Program: DesignPatterns
 * @Description:
 * @Author: YiMing
 * @Created: 2020/09/24 20:42
 */
public class DogCompare implements Comparator<Dog>{

    @Override
    public int compare(Dog o1, Dog o2) {
        if (o1.food > o2.food) return 1;
        else if (o1.food < o2.food) return -1;
        else return 0;
    }
}
