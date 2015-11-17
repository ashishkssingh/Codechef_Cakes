import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class flow004
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
            Scanner sc = new Scanner(System.in);
            int test =Integer.parseInt(sc.nextLine());
            for(int i=0;i<test;i++){
                String number = sc.nextLine();
                int first = Integer.parseInt(number.substring(0,1));
                int last = Integer.parseInt(number.substring(number.length()-1));
                System.out.println(first+last);
            }
        }
} 