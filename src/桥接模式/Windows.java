package 桥接模式;

/**
 * @author lcl100
 * @create 2021-07-10 21:35
 * @desc 扩展抽象化角色(windows操作系统)
 */
public class Windows extends OperatingSystem{
    public Windows(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    public void play(String fileName) {
        videoFile.decode(fileName);
    }
}
