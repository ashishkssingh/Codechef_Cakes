import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class flow018
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
            Scanner sc = new Scanner(System.in);
            int test = sc.nextInt();
            for(int i=0;i<test;i++){
                int num = sc.nextInt();
                int fact = 1;
                for(int j=2;j<=num;j++){
                    fact*=j;
                }
                System.out.println(fact);
            }
        }
} 