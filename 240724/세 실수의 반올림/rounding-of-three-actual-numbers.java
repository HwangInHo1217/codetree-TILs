import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] a = new double[3];
        
        for(int i = 0; i < a.length; i++)
            a[i] = sc.nextDouble();
        
        for(int i = 0; i < a.length; i++)
            System.out.printf("%.3f\n", a[i]);
    }
}