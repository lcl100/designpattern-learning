package 中介者模式.租房实例;

/**
 * @author lcl100
 * @create 2021-07-17 12:07
 * @desc 测试类
 */
public class Test {
    public static void main(String[] args) {
        //一个房主、一个租房者、一个中介机构
        MediatorStructure mediator = new MediatorStructure();

        //房主和租房者只需要知道中介机构即可
        HouseOwner houseOwner = new HouseOwner("张三", mediator);
        Tenant tenant = new Tenant("李四", mediator);

        //中介结构要知道房主和租房者
        mediator.setHouseOwner(houseOwner);
        mediator.setTenant(tenant);

        tenant.contact("需要租三室的房子");
        houseOwner.contact("我这有三室的房子，你需要租吗？");
    }
}
