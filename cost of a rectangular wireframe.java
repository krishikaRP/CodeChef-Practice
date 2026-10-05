import java.util.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int X = sc.nextInt();

            int cost = (2 * N + 2 * M) * X;

            System.out.println(cost);
        }
    }
}
