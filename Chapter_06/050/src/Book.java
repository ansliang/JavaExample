public class Book {
    private static int count = 0;
    public Book(String title) {
        System.out.println("售出图书：" + title);
        count++;
    }
    public static int getCount() {
        return count;
    }
}
