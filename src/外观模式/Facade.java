package 外观模式;

import 外观模式.subsystem.*;

public class Facade {
    private SubSystemA ssa=new SubSystemA();
    private SubSystemB ssb=new SubSystemB();
    private SubSystemC ssc=new SubSystemC();
    private SubSystemD ssd=new SubSystemD();
    private SubSystemE sse=new SubSystemE();

    public void comboMethodA(){
        // 封装一个子接口
        ssa.methodA();
        ssd.methodD();
        sse.methodE();
    }

    public void comboMethodB(){
        // 再封装一个子接口
        ssb.methodB();
        sse.methodE();
        ssc.methodC();
    }
}
