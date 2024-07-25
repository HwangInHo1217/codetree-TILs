import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int e_cnt = 0;
        int cnt = 0;
        for(int i = 1; i <= n; i++){
            if(i % 4 == 0 && i % 100 != 0)
                cnt++;
            if (i % 100 == 0)
               {
                   if(i % 400 != 0)
                       continue;
                   else
                       e_cnt++;
               }


        }
        System.out.println(e_cnt + cnt);
    }

}

/*
4로 나누어 떨어지는 해는 윤년, 그 밖의 해는 평년입니다.
단, 예외적으로 100으로 나누어 떨어지되 400으로 나누어 떨어지지 않는 해는 평년으로 합니다.
 */