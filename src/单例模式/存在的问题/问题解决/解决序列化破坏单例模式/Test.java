package 单例模式.存在的问题.问题解决.解决序列化破坏单例模式;


import java.io.*;

/**
 * @author lcl100
 * @create 2021-07-04 13:00
 * @desc 测试类，使用序列化破坏代理模式
 */
public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // 往文件中写入对象，要先写入
        writeObjectToFile();

        // 从文件中读取对象
        Singleton s1 = readObjectFromFile();
        Singleton s2 = readObjectFromFile();

        // 比较两个反序列化后的对象是否是同一个对象
        System.out.println(s1 == s2);// true
    }

    /**
     * 读取对象
     *
     * @return
     * @throws IOException
     * @throws ClassNotFoundException
     */
    private static Singleton readObjectFromFile() throws IOException, ClassNotFoundException {
        // 创建对象输入流对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("a.txt"));
        // 第一个读取Singleton对象
        Singleton instance = (Singleton) ois.readObject();
        // 返回获取的对象
        return instance;
    }

    /**
     * 读取对象
     *
     * @throws IOException
     */
    private static void writeObjectToFile() throws IOException {
        // 获取Singleton类的对象
        Singleton instance = Singleton.getInstance();
        // 创建对象输出流
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("a.txt"));
        // 将对象写入流输出到文件中
        oos.writeObject(instance);
    }
}