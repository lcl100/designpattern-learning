package 访问者模式.艺术公司与造币公司实例;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author lcl100
 * @create 2021-07-17 23:36
 * @desc 对象结构类，材料集
 */
public class MaterialSet {
    /**
     * 存储材料元素的集合
     */
    private List<Material> list = new ArrayList<>();

    /**
     * 让指定访问者访问list集合中的所有元素
     *
     * @param visitor 指定的访问者
     * @return 批量访问的结果
     */
    public String accept(Company visitor) {
        // 获取集合的迭代器
        Iterator<Material> iterator = list.iterator();
        // 遍历集合，让集合中的所有材料元素都被当前访问者所访问
        String result = "";
        while (iterator.hasNext()) {
            result += iterator.next().accept(visitor) + " ";
        }
        // 返回某公司的作品集
        return result;
    }

    /**
     * 添加元素到材料集合中
     *
     * @param element 待添加的元素
     */
    public void add(Material element) {
        list.add(element);
    }

    /**
     * 删除集合中的指定元素
     *
     * @param element 待删除的元素
     */
    public void remove(Material element) {
        list.remove(element);
    }
}
