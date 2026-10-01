import java.util.*;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();

        if (X < 3) {
            System.out.println("GOLD");
        } else if (X < 6) {
            System.out.println("SILVER");
        } else {
            System.out.println("BRONZE");
        }

        sc.close();
    }
}
