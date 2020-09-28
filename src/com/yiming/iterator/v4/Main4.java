package com.yiming.iterator.v4;

/**
 * @Program: DesignPatterns
 * @Description:
 * @Author: YiMing
 * @Created: 2020/09/28 12:03
 */
public class Main4 {
    public static void main(String[] args) {
        Collection_ list = new ArrayList_();
        for (int i = 0; i < 15; i++) {
            list.add(new String("s" + i));
        }
        System.out.println(list.size());

        //调用Iterator_接口
        Iterator_ it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        Collection_ list2 = new LinkedList_();
        for (int i = 0; i < 15; i++) {
            list2.add(new String("s" + i));
        }
        System.out.println(list2.size());

        //调用Iterator_接口
        Iterator_ it2 = list2.iterator();
        while (it2.hasNext()) {
            System.out.println(it2.next());
        }
    }
}
