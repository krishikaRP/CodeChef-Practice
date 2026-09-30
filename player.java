import java.util.*;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();

        int m = a * 2 + b;
        int r = x * 2 + y;

        if (m > r)
            System.out.println("Messi");
        else if (r > m)
            System.out.println("Ronaldo");
        else
            System.out.println("Equal");
    }
}
