import java.awt.*;

public class Test {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Java", 12, 21, Color.BLACK);
        Cat cat2 = new Cat("C++", 12, 21, Color.YELLOW);
        Cat cat3 = new Cat("Java", 12, 21, Color.BLACK);
        System.out.println(cat1);
        System.out.println(cat2);
        System.out.println(cat3);
        System.out.println("猫咪1号是否与猫咪2号相同：" + cat1.equals(cat2));
        System.out.println("猫咪1号是否与猫咪3号相同：" + cat1.equals(cat3));

    }
}
