import java.util.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int X = sc.nextInt();
            int Y = sc.nextInt();

            if (X < Y) {
                System.out.println("FIRST");
            } else if (X == Y) {
                System.out.println("ANY");
            } else {
                System.out.println("SECOND");
            }
        }

        sc.close();
    }
}
