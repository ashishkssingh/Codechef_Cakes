import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class gdog
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
            Scanner sc = new Scanner(System.in);
            int test = sc.nextInt();
            for(int i=0;i<test;i++){
                int n = sc.nextInt();
                int k = sc.nextInt();
                int maxrem=0,rem=0; 
                for(int j=2;j<=k;j++){
                rem=n%j;
                if(rem>maxrem)
                    maxrem=rem;
                }
                System.out.println(maxrem);
            }
        }
} 