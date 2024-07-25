import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int i = 0;

        System.out.print(a / b +".");
        a %= b;
        while (i < 20) {
            System.out.print((a * 10) / b);
            a = (a * 10) % b;
            i++;
        }
    }
}