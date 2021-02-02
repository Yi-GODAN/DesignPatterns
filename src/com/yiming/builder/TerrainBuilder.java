package com.yiming.builder;

/**
 * @Program: DesignPatterns
 * @Description:
 * @Author: YiMing
 * @Created: 2021/02/02 15:32
 */
public interface TerrainBuilder {

    TerrainBuilder builderWall();

    TerrainBuilder builderFort();

    TerrainBuilder builderMine();

    Terrain builder();

}
