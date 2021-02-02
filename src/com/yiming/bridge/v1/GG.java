package com.yiming.bridge.v1;

/**
 * @Program: DesignPatterns
 * @Description:
 * @Author: YiMing
 * @Created: 2021/02/02 12:42
 */
public class GG {

    public void chase(MM mm) {
        Gift g = new Flower();
        give(g);
    }

    public void give(Gift g) {
        g.gift();
    }

    public static void main(String[] args) {
        GG gg = new GG();
        gg.chase(new MM());
    }
}
