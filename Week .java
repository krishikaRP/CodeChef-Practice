import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        
        int count = 0;
        
        // Loop through the 4 weeks of input
        for (int i = 0; i < 4; i++) {
            if (sc.hasNextInt()) {
                int problemsSolved = sc.nextInt();
                // Check if Chef met the weekly target of at least 10 problems
                if (problemsSolved >= 10) {
                    count++;
                }
            }
        }
        
        // Output the total number of weeks the target was met
        System.out.println(count);
    }
}
