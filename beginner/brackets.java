import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger;
 
/* Name of the class has to be "Main" only if the class is public. */
class brackets
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
            Scanner sc = new Scanner(System.in);
            int test = Integer.parseInt(sc.nextLine());
            for(int i=0;i<test;i++){
                int balance=0;
                int maxBalance=0;
                String str = sc.nextLine();
                for(int j=0;j<str.length();j++){
                    if(str.charAt(j)=='(')
                        balance++;
                    else
                        balance--;
                    maxBalance = (balance > maxBalance)?balance:maxBalance;
                }
                for(int j=0;j<maxBalance;j++){
                System.out.print('(');
                }
                for(int j=0;j<maxBalance;j++){
                System.out.print(')');
                }
                System.out.println();
            }
        }
} 