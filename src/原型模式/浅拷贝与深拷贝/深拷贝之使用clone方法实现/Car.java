package 原型模式.浅拷贝与深拷贝.深拷贝之使用clone方法实现;

import java.io.Serializable;

public class Car implements Cloneable{
    private String name;

    public Car() {
    }

    public Car(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();// 都是String类型的属性，直接调用clone()方法即可
    }
}
