import java.util.Scanner;

public class InputCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的身份证号：");
        String line = scanner.nextLine();
        System.out.println("你的身份证号是：" + line);
        System.out.println("你的身份证号是" + line.length() + "位的。");
    }
}
