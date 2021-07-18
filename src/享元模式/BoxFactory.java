package 享元模式;

import java.util.HashMap;

/**
 * @author lcl100
 * @create 2021-07-11 11:58
 * @desc 工厂类，将该类设计为单例
 */
public class BoxFactory {
    // 提供了一个工厂类（BoxFactory），用来管理享元对象（也就是AbstractBox子类对象），该工厂类对象只需要一个，所以可以使用单例模式。并给工厂类提供一个获取形状的方法。

    private HashMap<String, AbstractBox> map;

    // 在构造方法中进行初始化操作，构造器私有化，通过单例模式来产生对象
    private BoxFactory() {
        map = new HashMap<>();
        map.put("I", new IBox());
        map.put("L", new LBox());
        map.put("O", new OBox());
    }

    // 提供一个方法获取该工厂类对象
    public static BoxFactory getInstance() {
        return factory;
    }

    private static BoxFactory factory = new BoxFactory();

    // 根据名称获取图形对象
    public AbstractBox getShape(String name) {
        return map.get(name);
    }
}
