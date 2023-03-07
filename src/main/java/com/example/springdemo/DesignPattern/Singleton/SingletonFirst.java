package com.example.springdemo.DesignPattern.Singleton;

public class SingletonFirst {
    private SingletonFirst(){
        // not do
    }
    /* 此处使用一个内部类来维护单例 */
    private static class SingletonFactory{
        private static SingletonFirst instance = new SingletonFirst();
    }

    /* 获取实例 */
    public static SingletonFirst getInstance(){
        return SingletonFactory.instance;
    }
}
