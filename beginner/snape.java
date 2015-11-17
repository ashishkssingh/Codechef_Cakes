import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class snape
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
            Scanner sc = new Scanner(System.in);
            int test =sc.nextInt();
            for(int i=0;i<test;i++){
                int base = sc.nextInt();
                int ls = sc.nextInt();
                float s = (ls*ls)-(base*base);
                float min = (float) Math.sqrt(s);
                float q = (ls*ls)+(base*base);
                float max = (float) Math.sqrt(q);
                
                System.out.printf("%f %f", min, max);
                System.out.println();
            }  
	}
} 