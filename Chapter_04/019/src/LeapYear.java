import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个年份：");
        int year;
        try {
            year = scanner.nextInt();
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println(year + "是闰年.");
            } else {
                System.out.println(year + "不是闰年.");
            }
        } catch (Exception e) {
            System.out.println("您输入的不是有效的年份.");
        }
    }
}
