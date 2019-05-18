import java.util.Scanner;

public class SimpleEncrypt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个加密字符串或解密字符串：");
        String password = scanner.nextLine();
        char[] array = password.toCharArray();  //获取字符数组
        for(int i=0; i<array.length; i++) {
            array[i] = (char)(array[i] ^ 20000);
        }
        System.out.println("加密或解密结果如下：");
        System.err.println(new String(array));
    }
}
