import java.util.*;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int G = sc.nextInt();
            int B = sc.nextInt();

            System.out.println(B - G);
        }

        sc.close();
    }
}
