package com.yiming.singleton;

/**
 * @Program: DesignPatterns
 * @Description: 静态内部类实现单例，JVM保证线程安全，加载外部类时不会加载内部类，这样可以实现懒加载
 * @Author: YiMing
 * @Created: 2020/09/21 22:51
 */
public class Mgr07 {

    private Mgr07() {
    }

    private static class Mgr07Inner {
        private static final Mgr07 INSTANCE = new Mgr07();

    }

    public static Mgr07 getInstance() {
        return Mgr07Inner.INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i<100;i++) {
            new Thread(() ->
                    System.out.println(Mgr07.getInstance().hashCode())
            ).start();
        }
    }
}
