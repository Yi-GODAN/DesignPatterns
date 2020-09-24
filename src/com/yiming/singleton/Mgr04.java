package com.yiming.singleton;

/**
 * @Program: DesignPatterns
 * @Description: 可通过synchronized解决，但是也带来了效率降低
 * @Author: YiMing
 * @Created: 2020/09/21 22:23
 */
public class Mgr04 {

    private static Mgr04 INSTANCE = null;

    private Mgr04() {}

    public static synchronized Mgr04 getInstance() {
        if (INSTANCE == null) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            INSTANCE = new Mgr04();
        }
        return INSTANCE;
    }

    public void m() {
        System.out.println("m");
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread( () ->
                    System.out.println(Mgr04.getInstance().hashCode())
            ).start();
        }
    }
}
