package com.yiming.iterator.v1;

/**
 * @Program: DesignPatterns
 * @Description: 相比数组，这个容器不用考虑边界问题，可以动态扩展
 * @Author: YiMing
 * @Created: 2020/09/28 11:13
 */
public class ArrayList_ {
    //定义初始大小
    Object[] objects = new Object[10];
    //list下一个空的位置在哪，或者说当前容器有多少个元素
    private int index = 0;

    //添加元素
    public void add(Object element) {
        if (index == objects.length) {
            Object[] newObject = new Object[(int) (index + index * 0.5)];
            System.arraycopy(objects,0, newObject, 0, index);
            objects = newObject;
        }
        objects[index] = element;
        index++;
    }

    //查看有多少个元素
    public int size() {
        return index;
    }

    public static void main(String[] args) {
        ArrayList_ a = new ArrayList_();
        for (int i = 0; i < 15; i++) {
            a.add(i);
        }
        System.out.println(a.size());
    }
}
