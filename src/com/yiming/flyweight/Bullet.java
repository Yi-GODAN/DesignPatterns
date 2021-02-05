package com.yiming.flyweight;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * @Program: DesignPatterns
 * @Description:
 * @Author: YiMing
 * @Created: 2020/09/27 18:57
 */
public class Bullet {
    public UUID id = UUID.randomUUID();
    boolean living = true;

}

class BulletPool {
    List<Bullet> bullets = new ArrayList<>();
    {
        for (int i = 0; i < 5; i++) bullets.add(new Bullet());
    }

    public Bullet getBullet() {
        for (Bullet b : bullets) {
            if (!b.living) return b;
        }
        return new Bullet();
    }
    public static void main(String[] args) {
        BulletPool bp = new BulletPool();

        for (int i = 0; i < 10; i++) {
            Bullet b = bp.getBullet();
            System.out.println(b);
        }
    }

}
