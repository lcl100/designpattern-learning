package 桥接模式;

import java.time.temporal.ValueRange;

/**
 * @author lcl100
 * @create 2021-07-10 21:29
 * @desc 抽象的操作系统类(抽象化角色)
 */
public abstract class OperatingSystem {
    // 声明videFile变量
    protected VideoFile videoFile;

    public OperatingSystem(VideoFile videoFile){
        this.videoFile= videoFile;
    }

    /**
     * 播放视频
     * @param fileName
     */
    public abstract void play(String fileName);
}
