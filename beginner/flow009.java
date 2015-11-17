import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class flow009
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
            Scanner sc = new Scanner(System.in);
            int test = sc.nextInt();
            for(int i=0;i<test;i++){
                float a = sc.nextFloat();
                float b = sc.nextFloat();
                
                if(a>1000)
                    System.out.printf("%.6f\n",a*b*0.9);
                else
                    System.out.printf("%.6f\n",a*b);
            }
        }
} 