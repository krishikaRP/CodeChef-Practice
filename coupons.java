
import java.util.*;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int X = sc.nextInt();

            int percentDiscount = X / 10;
            int flatDiscount = 100;

            System.out.println(Math.max(percentDiscount, flatDiscount));
        }

        sc.close();
    }
}
