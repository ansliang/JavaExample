public class Emperor {
    private static Emperor emperor = null;  //声明一个Emperor类的引用
    private Emperor() {                     //将构造方法私有
    }
    public static Emperor getInstance() {
        if(emperor==null){
            emperor = new Emperor();
        }
        return emperor;
    }
    public void getName(){
        System.out.println("皇帝只有一人.");
    }
}
