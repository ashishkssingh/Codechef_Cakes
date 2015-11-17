import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class trisq
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
            Scanner sc = new Scanner(System.in);
            int test =sc.nextInt();
            for(int i=0;i<test;i++){
                int B = sc.nextInt();
                if(B>3){
                int N = (B/2)-1;
                System.out.println(N*(N+1)/2);
                }
                else
                    System.out.println("0");
            }  
	}
} 