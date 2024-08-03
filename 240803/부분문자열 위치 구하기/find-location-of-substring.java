import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String find = sc.next();
        boolean rst = false;
        int n = 0;
        for(int i = 0; i < input.length(); i++){
            if(i + find.length() <= input.length() && input.substring(i, i + find.length()).equals(find)){
                rst = true;
                n = i;
                break;
            }
        }
        if(rst == true)
            System.out.println(n);
        else
            System.out.println(-1);
    }
}