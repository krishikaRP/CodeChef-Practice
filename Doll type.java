
import java.util.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            int ans = 0;

            for (int i = 0; i < N; i++) {
                ans ^= sc.nextInt();
            }

            System.out.println(ans);
        }

        sc.close();
    }
}
