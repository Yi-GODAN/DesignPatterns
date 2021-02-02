package com.yiming.builder;

/**
 * @Program: DesignPatterns
 * @Description:
 * @Author: YiMing
 * @Created: 2021/02/02 15:35
 */
public class ComplexTerrainBuilder implements TerrainBuilder {

    Terrain terrain = new Terrain();

    @Override
    public TerrainBuilder builderWall() {
        terrain.w = new Wall(1, 1, 1, 1);
        return this;
    }

    @Override
    public TerrainBuilder builderFort() {
        terrain.f = new Fort(1, 1, 1, 1);
        return this;
    }

    @Override
    public TerrainBuilder builderMine() {
        terrain.m = new Mine(1, 1, 1, 1);
        return this;
    }

    @Override
    public Terrain builder() {
        return this.terrain;
    }
}
