package com.yiming.bridge.v4;

/**
 * @Program: DesignPatterns
 * @Description:
 * @Author: YiMing
 * @Created: 2021/02/02 12:42
 */
public class GG {

    public void chase(MM mm) {
        Gift g = new WarmGift(new Book());
        give(mm, g);
    }

    public void give(MM mm, Gift g) {
        System.out.println(g + "gived!");
    }

}
