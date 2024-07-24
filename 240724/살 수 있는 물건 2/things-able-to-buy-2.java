import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n < 500)
             System.out.print("no");
        else if (n < 1000 && n > 499)
            System.out.print("pen");
        else if (n < 3000 && n > 999)
            System.out.print("mask");
        else 
            System.out.print("book");
    }
}