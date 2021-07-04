package 软件设计原则.接口隔离原则.before;

/**
 * @author lcl100
 * @create 2021-07-03 20:44
 * @desc 安全门接口
 */
public interface SafetyDoor {
    /**
     * 防盗
     */
    void antiTheft();
    /**
     * 防火
     */
    void fireproof();
    /**
     * 防水
     */
    void waterproof();
}
