import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[3];
        for(int i = 0; i < a.length; i++)
            a[i] = sc.nextInt();
        for(int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");        
    }
}