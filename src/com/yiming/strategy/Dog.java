package com.yiming.strategy;

/**
 * @Program: DesignPatterns
 * @Description:
 * @Author: YiMing
 * @Created: 2020/09/24 18:40
 */
public class Dog implements Comparable<Dog>{
    protected int food, age;

    public Dog(int food, int age) {
        this.food = food;
        this.age = age;
    }

    @Override
    public int compareTo(Dog d) {
        if (this.food > d.food) return 1;
        else if (this.food < d.food) return -1;
        else return 0;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "food=" + food +
                ", age=" + age +
                '}';
    }
}
