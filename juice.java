import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		
		if (sc.hasNextInt()) {
		    int t = sc.nextInt(); // Read number of test cases
		    
		    while (t-- > 0) {
		        int n = sc.nextInt(); // Read number of glasses sold
		        System.out.println(15 * n);
		    }
		}
		
		sc.close();
	}
}
