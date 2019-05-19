public class Initialization {
    private byte b;
    private short s;
    private int i;
    private long l;
    private float f;
    private double d;
    private boolean bl;
    private char c;
    private String string;

    public static void main(String[] args) {
        Initialization init = new Initialization();
        System.out.println("byte类型的初始值：" + init.b);
        System.out.println("short类型的初始值：" + init.s);
        System.out.println("int类型的初始值：" + init.i);
        System.out.println("long类型的初始值：" + init.l);
        System.out.println("float类型的初始值：" + init.f);
        System.out.println("double类型的初始值：" + init.d);
        System.out.println("boolean类型的初始值：" + init.bl);
        System.out.println("char类型的初始值：" + init.c);
        System.out.println("String类型的初始值：" + init.string);
    }
}
