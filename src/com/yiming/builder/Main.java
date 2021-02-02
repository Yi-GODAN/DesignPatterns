package com.yiming.builder;

/**
 * @Program: DesignPatterns
 * @Description:
 * @Author: YiMing
 * @Created: 2021/02/02 15:38
 */
public class Main {

    public static void main(String[] args) {
        TerrainBuilder ctb = new ComplexTerrainBuilder();
        Terrain builder = ctb.builderFort().builderMine().builderWall().builder();

        Person p = new Person.PersonBuilder()
                .basicInfo("make", 18)
                .score(100)
                .weight(120)
                .loc(new Location("sz", 203))
                .build();

        System.out.println(p);

    }

}
