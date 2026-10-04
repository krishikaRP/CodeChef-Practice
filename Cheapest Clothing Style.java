import java.util.*;

class Codechef {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int X1 = sc.nextInt();
            int Y1 = sc.nextInt();
            int X2 = sc.nextInt();
            int Y2 = sc.nextInt();

            int style1 = X1 + Y1;
            int style2 = X2 + Y2;

            System.out.println(Math.min(style1, style2));
        }

        sc.close();
    }
}
