package 原型模式.问题引入;

public class Client {
    public static void main(String[] args) {
        // 使用传统的方式复制10个具有相同属性值的对象
        // 初始对象，待复制的
        Person person0 = new Person("张三", 19, "男");
        // 复制10个具有相同属性值的对象
        Person person1 = new Person(person0.getName(), person0.getAge(), person0.getSex());
        Person person2 = new Person(person0.getName(), person0.getAge(), person0.getSex());
        Person person3 = new Person(person0.getName(), person0.getAge(), person0.getSex());
        Person person4 = new Person(person0.getName(), person0.getAge(), person0.getSex());
        Person person5 = new Person(person0.getName(), person0.getAge(), person0.getSex());
        Person person6 = new Person(person0.getName(), person0.getAge(), person0.getSex());
        Person person7 = new Person(person0.getName(), person0.getAge(), person0.getSex());
        Person person8 = new Person(person0.getName(), person0.getAge(), person0.getSex());
        Person person9 = new Person(person0.getName(), person0.getAge(), person0.getSex());
        Person person10 = new Person(person0.getName(), person0.getAge(), person0.getSex());
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
