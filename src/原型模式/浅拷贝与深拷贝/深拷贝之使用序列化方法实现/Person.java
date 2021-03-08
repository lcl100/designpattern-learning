package 原型模式.浅拷贝与深拷贝.深拷贝之使用序列化方法实现;

import java.io.*;

public class Person implements Serializable {

    private String name;
    private int age;
    private String sex;

    // 新添加一个Car引用类型的属性，克隆会如何处理
    public Car car;

    public Person() {
    }

    public Person(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }

    // 自定义的一个深拷贝克隆方法，不需要重写clone()方法
    public Person deepClone() {
        // 创建流对象
        ByteArrayOutputStream baos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bais = null;
        ObjectInputStream ois = null;
        try {
            // 序列化
            baos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(baos);
            oos.writeObject(this);//  //当前这个对象以对象流的方式输出

            // 反序列化
            bais = new ByteArrayInputStream(baos.toByteArray());
            ois = new ObjectInputStream(bais);
            Person copyPerson = (Person) ois.readObject();

            return copyPerson;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 关闭流
            try {
                baos.close();
                oos.close();
                bais.close();
                ois.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
