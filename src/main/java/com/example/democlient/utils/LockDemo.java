package com.example.democlient.utils;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class LockDemo {

    //定义锁对象
    private static final ReentrantLock lock = new ReentrantLock();
    //定义需要保证线程安全的方法
    public static void test(){
        lock.lock();
        try{
            //需要保证线程安全的代码
            //...method body
            boolean locked = lock.isLocked();
            boolean b = lock.tryLock(10000, TimeUnit.HOURS);
            System.out.println(locked);
        }catch (Exception e) {
            System.out.println(e);
        }
        //使用finally块来保证释放锁
        finally{
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        test();
    }
}
