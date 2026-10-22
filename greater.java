
import java.util.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int R1 = sc.nextInt();
            int R2 = sc.nextInt();
            int R3 = sc.nextInt();

            if (R1 > R2 + R3 || R2 > R1 + R3 || R3 > R1 + R2) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

        sc.close();
    }
}
