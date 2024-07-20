public class Main {
    public static void main(String[] args) {
        int a=5;
        int b=6;
        int c=7;
        int tmp;
        tmp=b;
        b=a;
        a=c;
        c=tmp;
        
        System.out.print(a+"\n"+b+"\n"+c);
    }
}