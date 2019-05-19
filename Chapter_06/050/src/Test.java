import java.util.Random;

public class Test {
    public static void main(String[] args) {
        String[] title = {"Book1", "Book2", "Book3"};
        for (int i = 0; i < 10; i++) {
            new Book(title[new Random().nextInt(3)]);
        }
        System.out.println("总共销售了" + Book.getCount() + "本书.");
    }
}
