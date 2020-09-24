package com.yiming.strategy;

/**
 * @Program: DesignPatterns
 * @Description:
 * @Author: YiMing
 * @Created: 2020/09/24 20:24
 */
public interface Comparator<T> {
    int compare(T o1, T o2);
}
