package com.yiming.strategy;

/**
 * @Program: DesignPatterns
 * @Description:
 * @Author: YiMing
 * @Created: 2020/09/24 18:02
 */
public class Sorter<T> {

    public void sort(T[] arr, Comparator<T> comparator) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (comparator.compare(arr[j], arr[j + 1]) == 1) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    public void swap(T[] arr, int i, int j) {
        T emp = arr[i];
        arr[i] = arr[j];
        arr[j] = emp;
    }
}
