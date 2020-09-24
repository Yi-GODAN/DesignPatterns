package com.yiming.singleton;

/**
 * @Program: DesignPatterns
 * @Description: lazy loading 也称懒汉式，虽然达到的按需初始化的目的，但在多线程环境下不安全
 * @Author: YiMing
 * @Created: 2020/09/21 21:57
 */
public class Mgr03 {

    private static Mgr03 INSTANCE;

    private Mgr03() {
    }

    public static Mgr03 getInstance() {
        if (INSTANCE == null) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            INSTANCE = new Mgr03();
        }
        return INSTANCE;
    }

    public void m() {
        System.out.println("m");
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() ->
                    System.out.println(Mgr03.getInstance().hashCode())
            ).start();
        }
    }
}
