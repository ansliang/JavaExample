public class OverloadingTest {
    public void info() {
        System.out.println("普通方法.");
    }

    public void info(int num) {
        System.out.println("重载方法.");
    }

    public static void main(String[] args) {
        OverloadingTest ot = new OverloadingTest();
        ot.info();
        ot.info(2);
    }
}
