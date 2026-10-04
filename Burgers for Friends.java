import java.util.*;

class Codechef {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt(); // number of friends
            int X = sc.nextInt(); // cost of one burger
            int K = sc.nextInt(); // money Chef has

            if (N * X <= K) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}
