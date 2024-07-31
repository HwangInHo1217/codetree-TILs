import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();

        String encodedResult = runLengthEncoding(input);

        System.out.println(encodedResult.length());
        System.out.println(encodedResult);
    }

    public static String runLengthEncoding(String s) {
        StringBuilder encodedStr = new StringBuilder();
        int count = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                encodedStr.append(s.charAt(i - 1)).append(count);
                count = 1;
            }
        }
        // 마지막 문자와 그 개수 추가
        encodedStr.append(s.charAt(s.length() - 1)).append(count);

        return encodedStr.toString();
    }
}