import java.io.*;

public class Test {
    public static void main(String[] args) {
        System.out.println("序列化之前：");
        Address address = new Address("中国", "湖北", "武汉");
        Employee employee1 = new Employee("张XX", 30, address);
        System.out.println("员工1的信息：");
        System.out.println(employee1);

        System.out.println("序列化之后：");
        ObjectOutputStream out = null;
        ObjectInputStream in = null;
        Employee employee2 = null;
        try {
            out = new ObjectOutputStream(new FileOutputStream("employee.dat"));
            out.writeObject(employee1);
            in = new ObjectInputStream(new FileInputStream("employee.dat"));
            employee2 = (Employee) in.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                try {
                    in.close();// 关闭输入流
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (out != null) {
                try {
                    out.close();// 关闭输出流
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        if (employee2 != null) {
            employee2.getAddress().setState("中国"); // 修改员工地址
            employee2.getAddress().setProvince("四川"); // 修改员工地址
            employee2.getAddress().setCity("成都"); // 修改员工地址
            employee2.setName("李XX"); // 修改员工名字
            employee2.setAge(24);// 修改员工年龄
            System.out.println("员工1的信息：");
            System.out.println(employee1);// 输出employee1对象
            System.out.println("员工2的信息：");
            System.out.println(employee2);// 输出employee2对象
        }
    }
}