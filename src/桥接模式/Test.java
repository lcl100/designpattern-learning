package 桥接模式;

/**
 * @author lcl100
 * @create 2021-07-10 21:40
 * @desc 测试类
 */
public class Test {
    public static void main(String[] args) {
        // 创建MAC系统对象
        OperatingSystem system = new Mac(new AVIFile());
        // 适用操作系统播放视频文件
        system.play("三体");
    }
}
