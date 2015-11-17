import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger;
 
/* Name of the class has to be "Main" only if the class is public. */
class fctrl2
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
            Scanner sc = new Scanner(System.in);
            int test = sc.nextInt();
            for(int i=0;i<test;i++){
                int num = sc.nextInt();
                BigInteger fact = BigInteger.ONE;
                for(int j=2;j<=num;j++){
                    fact= fact.multiply(BigInteger.valueOf(j));
                }
                System.out.println(fact);
            }
        }
} 