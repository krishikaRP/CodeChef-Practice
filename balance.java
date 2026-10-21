import java.util.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int W = sc.nextInt();
            int A = sc.nextInt();
            int B = sc.nextInt();
            int N = sc.nextInt();

            int balance = W + (A - B) * N;
            System.out.println(balance);
        }

        sc.close();
    }
}
