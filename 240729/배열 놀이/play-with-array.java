import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int arr[] = new int[n];
        int queryArr[][] = new int[q][3];

        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        for(int i = 0; i < q; i++)
        {
            for(int j = 0; j < 2; j++){
                queryArr[i][j] = sc.nextInt();
                if(j == 1 && queryArr[i][0] == 3){
                    queryArr[i][2] = sc.nextInt();

                }
            }
        }

        for(int i = 0; i < q; i ++){
           /* System.out.println("i" + " = " + (i+1) + " 번쨰 ");
            System.out.print("ㄴ>");*/
            if(queryArr[i][0] == 1){
                queryA(arr,queryArr[i][1]-1);
                }
            else if(queryArr[i][0] == 2){
                queryB(arr, queryArr[i][1]);
            }
            else if(queryArr[i][0] == 3){
                queryC(arr, queryArr[i][1]-1, queryArr[i][2]-1);
            }
        }
        }
        public static void queryA(int[] arr, int index){
            System.out.println(arr[index]);
        }
        public static void queryB(int[] arr, int findNum){
            int tmp = 0;
            for(int j = 0; j < arr.length; j++){
                if(arr[j] == findNum){
                    tmp = j + 1;
                    break;
                }
            }
            System.out.println(tmp);
        }
        public static void queryC(int[] arr, int start, int end){
            for(int k = start; k <= end; k++){
                System.out.print(arr[k] + " ");
            }
            System.out.println();
        }



    }