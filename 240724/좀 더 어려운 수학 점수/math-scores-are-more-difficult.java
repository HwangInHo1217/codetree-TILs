import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] A = new int[2];
        int[] B = new int[2];
        A = inputArray(A, sc);
        B = inputArray(B, sc);
        if(A[0] > B[0]){
            System.out.print("A");
        } 
        else if (A[0] == B[0]){
            if (A[1] > B [1]){
                System.out.print("A");
            }
            else{
                System.out.print("B");
            }
        }
        else{
            System.out.print("B");
        }
        

    }
    public static int[] inputArray(int[] arr, Scanner sc){
        
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }
}