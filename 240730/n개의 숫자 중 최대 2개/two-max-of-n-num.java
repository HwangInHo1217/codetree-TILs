import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[sc.nextInt()];
        int tmp;

        for(int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();
        for(int i = 0; i < arr.length; i++){
            for( int j = i; j < arr.length; j++){
                if (arr[i] < arr[j]){
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        System.out.println(arr[0] + " " + arr[1]);

    }
}