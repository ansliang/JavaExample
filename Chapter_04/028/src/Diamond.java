import java.util.Scanner;

public class Diamond {


    public static void printHollowRhombus(int size){
        for(int i=1; i<=(size-1); i++){
            if(i==1) {
                for (int j = 1; j <=(2*size-2); j++){
                    System.out.print(" ");
                }
                System.out.println("*");
            } else {
                for(int j=1; j<=(2*(size+i)-3); j++){
                    if(j==(2*(size-i)+1) || j==(2*(size+i)-3))
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                System.out.println();
            }
        }

        for(int i=size; i>=1; i--){
            if(i==1) {
                for (int j = 1; j <=(2*size-2); j++){
                    System.out.print(" ");
                }
                System.out.println("*");
            } else {
                for(int j=1; j<=(2*(size+i)-3); j++){
                    if(j==(2*(size-i)+1) || j==(2*(size+i)-3))
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输出的菱形边的长度：");
        int size = scanner.nextInt();
        printHollowRhombus(size);
    }
}
