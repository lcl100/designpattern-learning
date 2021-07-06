package 工厂模式.模式扩展;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @author lcl100
 * @create 2021-07-04 21:50
 * @desc 简单咖啡工厂类，生产咖啡
 */
public class SimpleCoffeeFactory {

    private static Map<String, Coffee> map = new HashMap<>();

    // 静态成员变量用来存储创建的对象（键存储的是名称，值存储的是对应的对象），而读取配置文件以及创建对象写在静态代码块中，目的就是只需要执行一次。
    static {
        Properties prop = new Properties();
        InputStream is = SimpleCoffeeFactory.class.getClassLoader().getResourceAsStream("bean.properties");
        try {
            prop.load(is);
            // 遍历properties集合对象
            Set<Object> keySet = prop.keySet();
            for (Object key : keySet) {
                // 根据键获取值，全类名
                String className = prop.getProperty((String) key);
                // 根据全类名加载字节码对象
                Class clazz = Class.forName(className);
                Coffee obj = (Coffee) clazz.newInstance();
                map.put((String) key, obj);
            }
        } catch (IOException | IllegalAccessException | InstantiationException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * 生成咖啡方法
     *
     * @param type 指定要生成的咖啡类型：美式咖啡american和拿铁咖啡latte
     * @return 返回生成完成的咖啡
     */
    public static Coffee orderCoffee(String type) {
        // 根据type生产不同的咖啡，不过从bean.properties中加载
        return map.get(type);
    }
}
