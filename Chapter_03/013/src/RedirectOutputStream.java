import java.io.FileNotFoundException;
import java.io.PrintStream;

public class RedirectOutputStream {
    public static void main(String[] args) {
        try{
            PrintStream out = System.out;                            //保存原输出流
            PrintStream ps = new PrintStream("./log.txt");  //创建文件输出流

            System.setOut(ps);                                       //设置使用新的输出流
            int age = 18;
            System.out.println("年龄变量成功定义，初始化为18.");
            String sex = "女";
            System.out.println("性别变量成功定义，初始化为女.");

            String info = "这是个" + sex + "孩子，应该有" + age + "岁了.";
            System.out.println(info);

            System.setOut(out);                                      //恢复原有输出流
            System.out.println("程序运行完毕，请查看日志文件.");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
