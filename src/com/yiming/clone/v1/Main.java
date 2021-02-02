package com.yiming.clone.v1;

/**
 * @Program: DesignPatterns
 * @Description: 浅克隆
 * @Author: YiMing
 * @Created: 2021/02/02 10:30
 */
public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Person p1 = new Person();
        Person p2 = (Person) p1.clone();

        System.out.println(p1.age + " " + p1.score);
        System.out.println(p2.age + " " + p2.score);

        System.out.println(p1.loc == p2.loc);

        p1.loc.street = "sz";

        System.out.println(p2.loc);

    }

}

class Person implements Cloneable {
    int age = 18;
    int score = 100;

    Location loc = new Location("ChangSha", 603);

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Location {
    String street;
    int roomNo;

    public Location(String street, int roomNo) {
        this.street = street;
        this.roomNo = roomNo;
    }

    @Override
    public String toString() {
        return "location{" +
                "street='" + street + '\'' +
                ", roomNo=" + roomNo +
                '}';
    }
}
