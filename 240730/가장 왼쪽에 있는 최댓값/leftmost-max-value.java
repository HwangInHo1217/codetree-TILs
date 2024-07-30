import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[sc.nextInt()];

        for(int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();

        while(arr.length >= 1){
            int idx = 0;
            int max = 0;
            for(int i = 0; i < arr.length; i++){
                if (max <= arr[i]){
                    max = arr[i];
                }
            }
            for(int i = 0; i < arr.length; i++){
                if(arr[i] == max){
                    idx = i;
                    break;
                }
            }
            System.out.print((idx + 1) + " ");
            arr = Arrays.copyOfRange(arr, 0, idx);
        }

    }
}