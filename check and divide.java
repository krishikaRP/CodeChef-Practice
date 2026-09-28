import java.util.*;

class Codechef {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();

            if (N % 2 == 0)
                System.out.println("Yes");
            else
                System.out.println("No");
        }

        sc.close();
    }
}
