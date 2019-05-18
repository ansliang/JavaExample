public class ErgodicArray {
    public static void main(String[] args) {
        String[] avgs = {"白鹭", "黄鹂", "鹦鹉", "乌鸦"};
        int index = 0;
        System.out.println("我的花园有很多鸟，包括：");
        while (index < avgs.length) {
            System.out.println(avgs[index++]);
        }
    }
}
