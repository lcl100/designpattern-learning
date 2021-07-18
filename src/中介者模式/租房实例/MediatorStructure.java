package 中介者模式.租房实例;

/**
 * @author lcl100
 * @create 2021-07-17 11:57
 * @desc 具体中介者，房屋中介机构
 */
public class MediatorStructure extends Mediator {
    // 首先中介结构必须指导所有房主和租客的信息
    private HouseOwner houseOwner;
    private Tenant tenant;

    public HouseOwner getHouseOwner() {
        return houseOwner;
    }

    public void setHouseOwner(HouseOwner houseOwner) {
        this.houseOwner = houseOwner;
    }

    public Tenant getTenant() {
        return tenant;
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }

    @Override
    public void contact(String message, Person person) {
        if(person==houseOwner){
            // 如果是房主，则租客获得信息
            tenant.getMessage(message);
        }else {
            // 表示是租客，那么房主获得信息
            houseOwner.getMessage(message);
        }
    }
}
