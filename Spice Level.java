import java.util.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int X = sc.nextInt();

            if (X < 4) {
                System.out.println("MILD");
            }
            else if (X < 7) {
                System.out.println("MEDIUM");
            }
            else {
                System.out.println("HOT");
            }
        }
    }
}
