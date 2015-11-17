import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class smpair
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt(), n, a, b, temp, val;
        for(int i = 0; i < t; i++) {
            n = sc.nextInt();
            a = sc.nextInt();
            b = sc.nextInt();
            if(b < a) {
                temp = a;
                a = b;
                b = temp;
            }
            for(int j = 2; j < n; j++) {
                val = sc.nextInt();
                if(val < a) {
                    b = a;
                    a = val;
                } else if(val < b) {
                    b = val;
                }
            }
            System.out.println(a + b);
        }
    }
} 