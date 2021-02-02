package com.yiming.builder;

/**
 * @Program: DesignPatterns
 * @Description:
 * @Author: YiMing
 * @Created: 2021/02/02 15:45
 */
public class Person {

    String name;
    int age;
    int score;
    int weight;
    Location loc;

    public Person() {
    }

    public static class PersonBuilder {
        Person p = new Person();

        public PersonBuilder basicInfo(String name, int age) {
            p.name = name;
            p.age = age;
            return this;
        }

        public PersonBuilder score(int score) {
            p.score = score;
            return this;
        }

        public PersonBuilder weight(int weight) {
            p.weight = weight;
            return this;
        }

        public PersonBuilder loc(Location loc) {
            p.loc = loc;
            return this;
        }

        public Person build() {
            return p;
        }

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                ", weight=" + weight +
                ", loc=" + loc +
                '}';
    }
}

class Location {
    String street;
    int roomNo;

    public Location() {
    }

    public Location(String street, int roomNo) {
        this.street = street;
        this.roomNo = roomNo;
    }

    @Override
    public String toString() {
        return "Location{" +
                "street='" + street + '\'' +
                ", roomNo=" + roomNo +
                '}';
    }
}