import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        varChangePrint(a,b);
        


    }
    public static void varChangePrint(int a, int b){
        int tmp;
        tmp = a;
        a = b;
        b = tmp;
        System.out.print(a + " " + b);
    }
}