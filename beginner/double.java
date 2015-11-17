import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class double
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
            int test,s,d;
		Scanner sc = new Scanner (System.in);
		test=sc.nextInt();
		while(test--!=0){
                int num = sc.nextInt();
                if(num%2==0)
                    System.out.println(num);
                else
                    System.out.println(num-1);
                }
                sc.close();
	}
} 