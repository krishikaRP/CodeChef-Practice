import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        
        // Read the total number of test cases
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            
            while (t-- > 0) {
                int n = sc.nextInt();
                
                // Find the last digit using modulo 10
                int lastDigit = n % 10;
                
                // Find the first digit by continuously dividing by 10
                int firstDigit = n;
                while (firstDigit >= 10) {
                    firstDigit /= 10;
                }
                
                // Print the sum of the first and last digits
                System.out.println(firstDigit + lastDigit);
            }
        }
    }
}
