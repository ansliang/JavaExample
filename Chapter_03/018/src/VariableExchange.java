import java.util.Scanner;

public class VariableExchange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入变量值A：");
        long A = scanner.nextLong();
        System.out.println("请输入变量值B：");
        long B = scanner.nextLong();
        System.out.println("A = " + A + "\tB = " + B);
        A = A ^ B;
        B = B ^ A;
        A = A ^ B;
        System.out.println("A = " + A + "\tB = " + B);
    }
}