import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String arr[] = new String[10];
        int cnt = 0;
        char findChar;
        for(int i = 0; i < 10; i++)
            arr[i] = sc.next();
        findChar = sc.next().charAt(0);
        for(int i = 0; i < 10; i++){
            char lastChar = arr[i].charAt(arr[i].length() - 1);
            if (lastChar == findChar){
                System.out.println(arr[i]);
                cnt++;
            }

        }
        if (cnt == 0)
            System.out.println("None");
    }
}