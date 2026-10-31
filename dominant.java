
import java.util.*;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int a[] = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            int max = 0;
            int ways = 0;

            for (int i = 0; i < n; i++) {

                boolean duplicate = false;

                for (int k = 0; k < i; k++) {
                    if (a[i] == a[k]) {
                        duplicate = true;
                        break;
                    }
                }

                if (duplicate) {
                    continue;
                }

                int count = 0;

                for (int j = 0; j < n; j++) {
                    if (a[i] == a[j]) {
                        count++;
                    }
                }

                if (count > max) {
                    max = count;
                    ways = 1;
                } 
                else if (count == max) {
                    ways++;
                }
            }

            if (ways == 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}
