import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
           if(i > 29 && i < 40)
               System.out.print(0 + " ");
           else if(i > 59 && i < 70)
               System.out.print(0 + " ");
           else if(i > 89 && i < 100)
               System.out.print(0 + " ");
           else if (i % 10 == 0)
               System.out.print(i + " ");
           else if (i % 3 == 0 || (i % 10) % 3 == 0 || (i % 10) % 6 == 0 || (i % 10) % 9 == 0 )
               System.out.print(0 + " ");
           else
               System.out.print(i + " ");
        }
    }
}