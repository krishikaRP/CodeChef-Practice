import java.util.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int X = sc.nextInt(); // Cost Price
            int Y = sc.nextInt(); // Selling Price

            if (X > Y) {
                System.out.println("LOSS");
            } else if (X == Y) {
                System.out.println("NEUTRAL");
            } else {
                System.out.println("PROFIT");
            }
        }

        sc.close();
    }
}
