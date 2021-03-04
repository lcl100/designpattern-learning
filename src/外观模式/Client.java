package 外观模式;

import 外观模式.subsystem.*;

/**
 * @author lcl100
 * 客户端类，不关心调用了那些子类接口，只关心外观类的功能方法
 */
public class Client {
    public static void main(String[] args) {
        // 不需要知道子系统有几个接口，只需要外观类的组合接口即可。
        // 实例化外观类Facade
        Facade facade = new Facade();
        // 通过外观模式，调用组合接口A
        facade.comboMethodA();
        // 通过外观模式，调用组合接口B
        facade.comboMethodB();


        /* ------------------------下面是不使用外观模式，直接调用子系统类的代码----------------------- */
        // 相当于调用comboMethodA()
        SubSystemA ssa = new SubSystemA();
        ssa.methodA();
        SubSystemD ssd = new SubSystemD();
        ssd.methodD();
        SubSystemE sse = new SubSystemE();
        sse.methodE();
        // 相当于调用comboMethodB()
        SubSystemB ssb = new SubSystemB();
        ssb.methodB();
        sse.methodE();
        SubSystemC ssc = new SubSystemC();
        ssc.methodC();
    }
}
