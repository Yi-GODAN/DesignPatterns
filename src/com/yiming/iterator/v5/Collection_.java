package com.yiming.iterator.v5;

/**
 * @Program: DesignPatterns
 * @Description:
 * @Author: YiMing
 * @Created: 2020/09/28 12:02
 */
public interface Collection_<E> {
    void add(E o);
    int size();
    Iterator_ iterator();
}
