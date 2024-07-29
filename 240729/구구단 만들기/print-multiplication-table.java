import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int startNum = sc.nextInt();
        int endNum = sc.nextInt();

        for (int i = 1; i <= 9; i++){
            for(int j = endNum; j >= startNum; j-=2){
                System.out.print(j + " * " + i + " = " + (j * i));
                if (j != startNum) {
                    System.out.print(" / ");
                }
            }
            System.out.println();
        }


    }

}