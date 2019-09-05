package com.pattern.creation.singleton.day04;

/**
 * 双检锁/双重校验锁（DCL，即 double-checked locking）
 *
 * 是否 Lazy 初始化：是
 * 是否多线程安全：是
 * 实现难度：较复杂
 * 描述：这种方式采用双锁机制，安全且在多线程情况下能保持高性能。
 * getInstance() 的性能对应用程序很关键。
 */
public class Singleton {

    private volatile static Singleton instance=null;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if(instance==null) {
            synchronized (Singleton.class) {
                if(instance==null) {
                    instance=new Singleton();
                }
            }
        }
        return instance;
    }
}
