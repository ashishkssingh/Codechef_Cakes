import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class remiss
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
            Scanner sc = new Scanner(System.in);
            int test =sc.nextInt();
            for(int i=0;i<test;i++){
                int A = sc.nextInt();
                int B = sc.nextInt();
                int C = A>B?A:B;
                System.out.printf("%d %d\n",C,A+B);
            }  
	}
} 