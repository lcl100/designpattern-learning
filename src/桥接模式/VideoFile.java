package 桥接模式;

/**
 * @author lcl100
 * @create 2021-07-10 21:31
 * @desc 视频文件(实现化角色)
 */
public interface VideoFile {
    /**
     * 解码视频文件
     *
     * @param fileName 视频文件名
     */
    public void decode(String fileName);
}
