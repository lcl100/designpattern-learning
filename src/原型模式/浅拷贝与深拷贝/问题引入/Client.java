package 原型模式.浅拷贝与深拷贝.问题引入;


public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person0 = new Person("张三", 19, "男");
        person0.child = new Person("张三子", 1, "男");
        // 进行克隆
        Person person1 = (Person) person0.clone();// 克隆
        Person person2 = (Person) person0.clone();// 克隆
        Person person3 = (Person) person0.clone();// 克隆
        Person person4 = (Person) person0.clone();// 克隆
        Person person5 = (Person) person0.clone();// 克隆
        // 打印对象及child属性的哈希值
        System.out.println("person0=" + person0 + ",person0.child.hashCode()=" + person0.child.hashCode());
        System.out.println("person1=" + person1 + ",person1.child.hashCode()=" + person1.child.hashCode());
        System.out.println("person2=" + person2 + ",person2.child.hashCode()=" + person2.child.hashCode());
        System.out.println("person3=" + person3 + ",person3.child.hashCode()=" + person3.child.hashCode());
        System.out.println("person4=" + person4 + ",person4.child.hashCode()=" + person4.child.hashCode());
        System.out.println("person5=" + person5 + ",person5.child.hashCode()=" + person5.child.hashCode());
    }
}
