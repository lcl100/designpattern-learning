package 访问者模式.艺术公司与造币公司实例;

/**
 * @author lcl100
 * @create 2021-07-17 23:42
 * @desc 测试类
 */
public class Test {
    public static void main(String[] args) {
        // 创建材料元素集合
        MaterialSet ms = new MaterialSet();
        ms.add(new Paper());// 向集合中添加元素
        ms.add(new Cuprum());// 向集合中添加元素

        // 创建具体的访问者，让该访问者来访问对象结构中的所有元素
        Company artCompany = new ArtCompany();
        System.out.println(ms.accept(artCompany));

        System.out.println("==========================");

        // 创建具体的访问者，让该访问者来访问对象结构中的所有元素
        Company mintCompany = new MintCompany();
        System.out.println(ms.accept(mintCompany));
    }
}
