import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class rectsq
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
            Scanner sc = new Scanner(System.in);
            int test = sc.nextInt();
            while(test--!=0){
                int a = sc.nextInt();
                int b = sc.nextInt();
                int g = gcd(a,b);
            
                System.out.println((a*b)/(g*g));
            }
            sc.close();
    }  
        static int gcd(int x, int y)
    {
        int r=0, a, b;
        a = (x > y) ? x : y; // a is greater number
        b = (x < y) ? x : y; // b is smaller number
 
        r=b;
        while(a%b!=0)
        {
            r = a%b;
            a = b;
            b = r;
        }
        return r;
    }
} 