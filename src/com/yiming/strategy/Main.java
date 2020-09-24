package com.yiming.strategy;

import java.util.Arrays;

/**
 * @Program: DesignPatterns
 * @Description:
 * @Author: YiMing
 * @Created: 2020/09/24 18:02
 */
public class Main {

    public static void main(String[] args) {
        //int[] arr = new int[]{3, 9, 0, 6, 7, 5, 4, 8, 1};
        Cat[] a = {new Cat(1, 6), new Cat(5, 1), new Cat(3, 3)};
        Dog[] d = {new Dog(5, 3), new Dog(3, 5), new Dog(8, 2)};

        /*Sorter.sort(a);
        System.out.println(Arrays.toString(a));

        Sorter.sort(d);
        System.out.println(Arrays.toString(d));*/

        Sorter<Cat> sorter1 = new Sorter<>();
        sorter1.sort(a, new CatHeightCompare());    //比较高度
        System.out.println(Arrays.toString(a));
        sorter1.sort(a,new CatWeightCompare());
        System.out.println(Arrays.toString(a));

        Sorter<Dog> sorter2 = new Sorter<>();
        sorter2.sort(d, new DogCompare());
        System.out.println(Arrays.toString(d));

    }
}
