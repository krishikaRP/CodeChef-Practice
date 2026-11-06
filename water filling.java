
import java.util.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            int count = 0;

            if (a == 0) count++;
            if (b == 0) count++;
            if (c == 0) count++;

            if (count >= 2) {
                System.out.println("Water filling time");
            } else {
                System.out.println("Not now");
            }
        }

        sc.close();
    }
}
