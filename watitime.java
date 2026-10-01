import java.util.*;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int K = sc.nextInt();
            int X = sc.nextInt();

            System.out.println(7 * K - X);
        }

        sc.close();
    }
}
