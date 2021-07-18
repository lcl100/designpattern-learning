package 组合模式;

/**
 * @author lcl100
 * @create 2021-07-11 10:41
 * @desc 测试类
 */
public class Test {
    public static void main(String[] args) {
        // 创建二级菜单
        MenuComponent menu1=new Menu("菜单管理",2);
        menu1.add(new MenuItem("页面访问",3));// 创建三级菜单
        menu1.add(new MenuItem("展开菜单",3));// 创建三级菜单
        menu1.add(new MenuItem("编辑菜单",3));// 创建三级菜单
        menu1.add(new MenuItem("删除菜单",3));// 创建三级菜单
        menu1.add(new MenuItem("新增菜单",3));// 创建三级菜单

        // 创建二级菜单
        MenuComponent menu2=new Menu("权限管理",2);
        menu2.add(new MenuItem("页面访问",3));// 创建三级菜单
        menu2.add(new MenuItem("提交保存",3));// 创建三级菜单

        // 创建二级菜单
        MenuComponent menu3=new Menu("角色管理",2);
        menu3.add(new MenuItem("页面访问",3));// 创建三级菜单
        menu3.add(new MenuItem("新增角色",3));// 创建三级菜单
        menu3.add(new MenuItem("修改角色",3));// 创建三级菜单

        // 创建一级菜单
        MenuComponent component=new Menu("系统管理",1);
        // 将二级菜单添加到一级菜单中
        component.add(menu1);
        component.add(menu2);
        component.add(menu3);

        // 打印菜单的名称，如果有子菜单则一起打印
        component.print();
    }
}
