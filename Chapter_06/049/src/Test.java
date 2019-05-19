public class Test {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person("A", "boy", 20);
        System.out.println("员工1的信息：");
        System.out.println("员工姓名：" + p1.getName());
        System.out.println("员工性别：" + p1.getGender());
        System.out.println("员工年龄：" + p1.getAge());

        System.out.println("员工2的信息：");
        System.out.println("员工姓名：" + p2.getName());
        System.out.println("员工性别：" + p2.getGender());
        System.out.println("员工年龄：" + p2.getAge());
    }
}
