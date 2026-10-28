
import java.util.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            HashSet<Integer> days = new HashSet<>();

            for (int i = 0; i < n; i++) {
                days.add(sc.nextInt());
            }

            System.out.println(days.size());
        }

        sc.close();
    }
}
