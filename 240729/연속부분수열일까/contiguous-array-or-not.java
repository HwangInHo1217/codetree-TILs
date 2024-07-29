import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []arrA = new int[sc.nextInt()];
        int []arrB = new int[sc.nextInt()];
        int cnt = 0;
        for(int i = 0; i < arrA.length; i++)
            arrA[i] = sc.nextInt();
        for(int i = 0; i < arrB.length; i++)
            arrB[i] = sc.nextInt();

        for(int i = 0; i < arrA.length; i++){
            if ( i + arrB.length > arrA.length){
                //System.out.println("break");
                break;
            }
            if(arrA[i] == arrB[0]){
                for(int j = 0; j < arrB.length; j++){
                    if (arrA[i+j] == arrB[j]){
                        //System.out.println("i = " + i + " : ");
                        //System.out.print("arrB = " + arrB[j]);

                        cnt++;
                        //System.out.println(" : cnt = " + cnt);

                }

            }
        }

        }
        if(cnt == arrB.length)
            System.out.println("Yes");
        else
            System.out.println("No");



    }
}