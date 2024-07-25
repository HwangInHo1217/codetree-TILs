import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int Temperature[] = new int[3];
        char State[] = new char[3];     
        int cnt = 0;

        for(int i = 0; i < Temperature.length; i++){
            State[i] = sc.next().charAt(0);
            Temperature[i] = sc.nextInt();
        }

        for(int i = 0; i < Temperature.length; i ++){
            if(Temperature[i] >= 37 && State[i] == 'Y')
                cnt++;
        }
        if(cnt >= 2)
            System.out.print("E");
        else
            System.out.print("N");
    }
}