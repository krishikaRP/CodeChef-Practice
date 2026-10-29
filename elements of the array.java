```java
import java.util.*;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            int[] A = new int[N];
            int[] freq = new int[N + 1];

            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
                freq[A[i]]++;
            }

            int max = 0;

            for (int i = 1; i <= N; i++) {
                if (freq[i] > max) {
                    max = freq[i];
                }
            }

            System.out.println(N - max);
        }

        sc.close();
    }
}
```
