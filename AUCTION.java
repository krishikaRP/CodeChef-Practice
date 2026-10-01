import java.util.*;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();

            if (A > B && A > C) {
                System.out.println("Alice");
            } else if (B > A && B > C) {
                System.out.println("Bob");
            } else {
                System.out.println("Charlie");
            }
        }

        sc.close();
    }
}
