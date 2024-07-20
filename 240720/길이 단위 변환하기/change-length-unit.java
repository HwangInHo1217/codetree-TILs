public class Main {
    public static void main(String[] args) {
        double ft = 30.48;
        double mi = 160934;
        double targetFt = 9.2;
        double targetMi = 1.3;

        System.out.print(targetFt + "ft = ");
        System.out.printf("%.1f", (targetFt*ft));
        System.out.print("cm\n"+targetMi+"mi = ");
        System.out.printf("%.1f",(targetMi*mi));
        System.out.print("cm");
    }
}