package 原型模式.浅拷贝与深拷贝.深拷贝之使用clone方法实现;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person0 = new Person("张三", 19, "男");
        person0.car = new Car("大卡车");
        // 进行克隆
        Person person1 = (Person) person0.clone();// 克隆
        Person person2 = (Person) person0.clone();// 克隆
        Person person3 = (Person) person0.clone();// 克隆
        Person person4 = (Person) person0.clone();// 克隆
        Person person5 = (Person) person0.clone();// 克隆
        // 打印对象及child属性的哈希值
        System.out.println("person0=" + person0 + ",person0.car.hashCode()=" + person0.car.hashCode());
        System.out.println("person1=" + person1 + ",person1.car.hashCode()=" + person1.car.hashCode());
        System.out.println("person2=" + person2 + ",person2.car.hashCode()=" + person2.car.hashCode());
        System.out.println("person3=" + person3 + ",person3.car.hashCode()=" + person3.car.hashCode());
        System.out.println("person4=" + person4 + ",person4.car.hashCode()=" + person4.car.hashCode());
        System.out.println("person5=" + person5 + ",person5.car.hashCode()=" + person5.car.hashCode());
    }
}
