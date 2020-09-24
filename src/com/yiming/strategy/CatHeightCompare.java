package com.yiming.strategy;

/**
 * @Program: DesignPatterns
 * @Description:
 * @Author: YiMing
 * @Created: 2020/09/24 20:46
 */
public class CatHeightCompare implements Comparator<Cat> {
    @Override
    public int compare(Cat o1, Cat o2) {
        if (o1.height > o2.height) return 1;
        else if (o1.height < o2.height) return -1;
        else return 0;
    }
}
