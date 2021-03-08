package 原型模式.浅拷贝与深拷贝.问题引入;

public class Person implements Cloneable {
    private String name;
    private int age;
    private String sex;

    // 新添加一个Person引用类型的属性，克隆会如何处理
    public Person child;

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

    // 克隆该实例，使用默认的clone()方法来完成
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person person = null;
        try {
            person = (Person) super.clone();// 调用父类Object的clone()方法默认实现就可以了
        } catch (Exception e) {
            e.printStackTrace();
        }
        return person;
    }
}
