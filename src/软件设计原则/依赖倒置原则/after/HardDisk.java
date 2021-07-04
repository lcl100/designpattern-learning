package 软件设计原则.依赖倒置原则.after;

/**
 * @author lcl100
 * @create 2021-07-03 20:16
 * @desc 硬盘接口
 */
public interface HardDisk {
    /**
     * 保存数据到硬盘中
     *
     * @param data 待保存的数据
     */
    void save(String data);

    /**
     * 获取数据
     *
     * @return 获取到的数据
     */
    String get();
}
