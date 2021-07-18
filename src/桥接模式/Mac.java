package 桥接模式;

/**
 * @author lcl100
 * @create 2021-07-10 21:36
 * @desc Mac操作系统(扩展抽象化角色)
 */
public class Mac extends OperatingSystem {
    public Mac(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    public void play(String fileName) {
        videoFile.decode(fileName);
    }
}
