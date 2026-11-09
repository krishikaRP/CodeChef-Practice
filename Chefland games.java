import java.util.*;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();

            if (a == 0 && b == 0 && c == 0 && d == 0)
                System.out.println("IN");
            else
                System.out.println("OUT");
        }
    }
}
