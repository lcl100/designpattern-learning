package 建造者模式;

/**
 * @author lcl100
 * @create 2021-07-06 22:02
 * @desc 单车产品
 */
public class Bike {
    private String frame;// 车架
    private String seat;// 坐架

    public String getFrame() {
        return frame;
    }

    public void setFrame(String frame) {
        this.frame = frame;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }
}
