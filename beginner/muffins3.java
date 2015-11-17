import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class muffins3
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
            Scanner sc = new Scanner(System.in);
            int test =Integer.parseInt(sc.nextLine());
            for(int i=0;i<test;i++){
                long num_0f_cup = sc.nextLong();
                System.out.println((num_0f_cup/2)+1);
            }
        }
} 