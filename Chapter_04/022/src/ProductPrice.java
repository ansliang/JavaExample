public class ProductPrice {
    public static void main(String[] args) {
        double money = 1170;//金额
        String rebate = ""; //折扣
        if (money > 200) {
            int grade = (int) money / 200;
            switch (grade) {
                case 1:
                    rebate = "九折";
                    break;
                case 2:
                    rebate = "八折";
                    break;
                case 3:
                    rebate = "七折";
                    break;
                default:
                    rebate = "六折";
            }
            System.out.println("您的累积消费金额为：" + money);
            System.out.println("您将享受" + rebate + "优惠。");
        } else {
            System.out.println("您的累积消费金额为：" + money + "消费满200才能享受优惠。");
        }
    }
}
