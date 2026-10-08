import java.util.*;

class Codechef {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int X = sc.nextInt();
            int Y = sc.nextInt();

            if (X > 10 * Y) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
