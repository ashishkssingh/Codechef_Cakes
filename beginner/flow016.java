import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class flow016
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
            Scanner sc = new Scanner(System.in);
            int test = sc.nextInt();
            for(int i=0;i<test;i++){
                int temp;
                int a = sc.nextInt();
                int b = sc.nextInt();
                int temp1 = a;
                int temp2 = b;
                while(temp2 !=0){
                temp=temp2;
                temp2=temp1%temp2;
                temp1=temp;
                }
                int gcd =temp1;
                long lcm = (long)(a*b)/gcd;
                System.out.println(gcd+" "+lcm);
            }
    }  
} 