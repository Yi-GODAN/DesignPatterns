package com.yiming.iterator.v3;

/**
 * @Program: DesignPatterns
 * @Description:
 * @Author: YiMing
 * @Created: 2020/09/28 12:03
 */
public class Main3 {
    public static void main(String[] args) {
        Collection_ c = new ArrayList_();
        for (int i = 0; i < 15; i++) {
            c.add(i);
        }
        System.out.println(c.size());

        Collection_ c2 = new LinkedList_();
        for (int i = 0; i < 15; i++) {
            c2.add(i);
        }
        System.out.println(c2.size());
    }
}
