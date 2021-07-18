package 桥接模式;

/**
 * @author lcl100
 * @create 2021-07-10 21:32
 * @desc avi视频文件（具体的实现化角色）
 */
public class AVIFile implements VideoFile {
    @Override
    public void decode(String fileName) {
        System.out.println("avi视频文件 ：" + fileName);
    }
}
