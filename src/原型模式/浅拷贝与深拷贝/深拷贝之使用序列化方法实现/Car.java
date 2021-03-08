package 原型模式.浅拷贝与深拷贝.深拷贝之使用序列化方法实现;

import java.io.Serializable;

public class Car implements Serializable {

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
}
