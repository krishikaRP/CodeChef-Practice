import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int X = sc.nextInt();
            int Y = sc.nextInt();

            int buy = X - Y;
            int newPrice = X + X * 10 / 100;
            int profit = newPrice - buy;

            System.out.println(profit);
        }
        sc.close();
    }
}
