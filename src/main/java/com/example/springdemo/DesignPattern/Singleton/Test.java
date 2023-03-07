package com.example.springdemo.DesignPattern.Singleton;

public class Test {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton == singleton1);

        SingletonFirst singletonFirst = SingletonFirst.getInstance();
        SingletonFirst singletonFirst1 = SingletonFirst.getInstance();
        System.out.println(singletonFirst == singletonFirst1);
    }
}
