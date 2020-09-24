package com.yiming.singleton;

/**
 * @Program: DesignPatterns
 * @Description:饿汉式
 * @Author: YiMing
 * @Created: 2020/09/21 21:41
 */

/**
 * 饿汉式
 * 类加载到内存后，就实例化一个单例，JVM保证线程安全
 * 简单使用，推荐
 * Class.forName("")
 * 唯一缺点，不管用到与否，类装载时完成实例化
 */
public class Mgr01 {

    private static final Mgr01 INSTANCE = new Mgr01();

    private Mgr01 () {}

    private static Mgr01 getInstance() {
        return INSTANCE;
    }

    public void m() {
        System.out.println("m");
    }

    public static void main(String[] args) {
        Mgr01 mgr01 = Mgr01.getInstance();
        Mgr01 mgr02 = Mgr01.getInstance();
        System.out.println(mgr01 == mgr02);
    }
}
