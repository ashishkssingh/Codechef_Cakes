import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class flow014
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
            Scanner sc = new Scanner(System.in);
            int test = sc.nextInt();
            for(int i=0;i<test;i++){
                float h,cc,ts;
                h = sc.nextFloat();
                cc = sc.nextFloat();
                ts = sc.nextFloat();
                if(h>50 && cc<0.7 && ts>5600)
	            System.out.println(10);
	        else if(h>50 && cc<0.7)
	            System.out.println(9);
	        else if(cc<0.7 && ts>5600)
	            System.out.println(8); 
	        else if(h>50 && ts>5600)
	            System.out.println(7); 
	        else if(h>50 || cc<0.7 || ts>5600)
	            System.out.println(6); 
	        else
	            System.out.println(5);   
            }
        }
} 