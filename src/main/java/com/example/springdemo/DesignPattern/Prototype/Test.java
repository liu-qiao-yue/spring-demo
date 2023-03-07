package com.example.springdemo.DesignPattern.Prototype;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Prototype prototype = new Prototype();
        prototype.setName("12");
        Prototype prototype1 = (Prototype) prototype.clone();
        System.out.println(prototype1 == prototype);// false

        prototype.getHobby().add("122");//可以修改爱好

        prototype.getCloneHobby();//无法使用add等接口
    }
}
