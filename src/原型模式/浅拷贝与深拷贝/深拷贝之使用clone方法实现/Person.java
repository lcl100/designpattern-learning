package 原型模式.浅拷贝与深拷贝.深拷贝之使用clone方法实现;

public class Person implements Cloneable {

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

    // 克隆该实例，使用默认的clone()方法来完成
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object person = null;
        // 完成对基本数据类型（属性）和String的克隆
        person = super.clone();

        // 对引用数据类型的属性，进行单独处理
        Person p = (Person) person;
        p.car = (Car) car.clone();// child属性是引用数据类型Car

        return person;
    }
}
