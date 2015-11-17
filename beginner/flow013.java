import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class flow013
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
            Scanner sc = new Scanner(System.in);
            Short test = sc.nextShort();
            for(short i=0;i<test;i++){
                short A = sc.nextShort();
                short B = sc.nextShort();
                short C = sc.nextShort();
                short sum = (short)(A+B+C);
                if(A==0 || B==0 || C==0 || sum!=180)
                    System.out.println("NO");
                else
                    System.out.println("YES");
            }
        }
} 