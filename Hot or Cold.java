import java.util.*;

class Codechef {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int X = sc.nextInt();

            if (X > 20) {
                System.out.println("HOT");
            } else {
                System.out.println("COLD");
            }
        }
    }
}
