package 原型模式.原型模式;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        // 使用原型模式复制10个具有相同属性值的对象
        // 初始对象，待复制的
        Person person0 = new Person("张三", 19, "男");
        // 复制10个具有相同属性值的对象
        Person person1 = (Person) person0.clone();
        Person person2 = (Person) person0.clone();
        Person person3 = (Person) person0.clone();
        Person person4 = (Person) person0.clone();
        Person person5 = (Person) person0.clone();
        Person person6 = (Person) person0.clone();
        Person person7 = (Person) person0.clone();
        Person person8 = (Person) person0.clone();
        Person person9 = (Person) person0.clone();
        Person person10 = (Person) person0.clone();
        System.out.println(person0);
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println(person4);
        System.out.println(person5);
        System.out.println(person6);
        System.out.println(person7);
        System.out.println(person8);
        System.out.println(person9);
        System.out.println(person10);
    }
}
