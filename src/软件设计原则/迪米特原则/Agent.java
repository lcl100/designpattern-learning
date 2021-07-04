package 软件设计原则.迪米特原则;

/**
 * @author lcl100
 * @create 2021-07-03 22:29
 * @desc 经纪人类
 */
public class Agent {
    private Star myStar;
    private Fans myFans;
    private Company myCompany;

    public void setMyStar(Star myStar) {
        this.myStar = myStar;
    }

    public void setMyFans(Fans myFans) {
        this.myFans = myFans;
    }

    public void setMyCompany(Company myCompany) {
        this.myCompany = myCompany;
    }

    /**
     * 明星与粉丝见面
     */
    public void meeting() {
        System.out.println(myFans.getName() + "与明星" + myStar.getName() + "见面了。");
    }

    /**
     * 明星与公司见面
     */
    public void business() {
        System.out.println(myCompany.getName() + "与明星" + myStar.getName() + "商谈业务。");
    }
}
