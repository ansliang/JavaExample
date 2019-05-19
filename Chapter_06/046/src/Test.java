public class Test {
    public static void main(String[] args) {
        System.out.println("创建皇帝对象1：");
        Emperor emperor1 = Emperor.getInstance();
        emperor1.getName();
        System.out.println("创建皇帝对象2：");
        Emperor emperor2 = Emperor.getInstance();
        emperor2.getName();
        System.out.println("创建皇帝对象3：");
        Emperor emperor3 = Emperor.getInstance();
        emperor3.getName();
    }
}
