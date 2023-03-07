package com.example.springdemo.DesignPattern.Prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * 原型模式（Prototype）
 * 该模式的思想就是将一个对象作为原型，对其进行复制、克隆，产生一个和原对象类似的新对象
 */
public class Prototype implements Cloneable {

    private String name;

    private ArrayList hobby = new ArrayList();//不能set,也不允许修改

    public Object clone() throws CloneNotSupportedException {
        //浅克隆
        return super.clone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List getHobby() {
        return hobby;
    }

    public Object getCloneHobby() {
        return hobby.clone();
    }

}
