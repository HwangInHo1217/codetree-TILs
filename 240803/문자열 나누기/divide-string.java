import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String arr[] = new String[size];
        String result = "";
        int cnt = 0;

        for(int i = 0; i < arr.length; i++)
            arr[i] = sc.next();

        for(int i = 0; i < arr.length; i++){
            result += arr[i];
            result += " ";
        }
        int j = 0;
        
        while(j < result.length()){
            char a = result.charAt(j);
            if(a == ' ') {
                j++;
                continue;
            }
            else if(j != ' '){
                System.out.print(a);
                cnt++;
            }
            if(cnt % 5 == 0)
                System.out.println();

            j++;
        }

    }
}