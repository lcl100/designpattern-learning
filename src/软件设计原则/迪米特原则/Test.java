package 软件设计原则.迪米特原则;

/**
 * @author lcl100
 * @create 2021-07-03 22:32
 */
public class Test {
    public static void main(String[] args) {
        // 创建经纪人类对象
        Agent agent = new Agent();
        // 传递Star、Fans和Company对象
        Star star = new Star("初音未来");
        agent.setMyStar(star);
        Fans fans = new Fans("张三");
        agent.setMyFans(fans);
        Company company = new Company("歌姬公司");
        agent.setMyCompany(company);
        // 调用方法
        agent.meeting();
        agent.business();
    }
}
