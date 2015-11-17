import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger;
 
/* Name of the class has to be "Main" only if the class is public. */
class pall01
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
            Scanner sc = new Scanner(System.in);
            int test = Integer.parseInt(sc.nextLine());
            for(int i=0;i<test;i++){
                String str = sc.nextLine();
                String rstr="";
                for(int j=str.length()-1;j>=0;j--){
                rstr+=str.charAt(j);
                }
                if(str.compareTo(rstr)==0)
                    System.out.println("wins");
                else
                    System.out.println("losses");
            }
        }
} 