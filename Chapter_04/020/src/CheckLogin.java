import java.util.Scanner;

public class CheckLogin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String username = scanner.nextLine();
        System.out.println("请输入密码：");
        String password = scanner.nextLine();

        if (!username.equals("ans")) {
            System.out.println("用户名非法！");
        } else if (!password.equals("123")) {
            System.out.println("密码错误！");
        } else {
            System.out.println("登陆成功！");
        }
    }
}
