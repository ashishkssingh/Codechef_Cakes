import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class hs08test
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
            Scanner sc = new Scanner(System.in);
            int amt=sc.nextInt();
            float total = sc.nextFloat();
            if((amt%5==0) && (amt+0.5<total)){
            total=(float) (total-amt-0.5);
            System.out.printf("%.2f",total);
            }
            else
                System.out.printf("%.2f",total);
    }  
} 