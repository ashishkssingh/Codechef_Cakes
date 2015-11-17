import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class flow007
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
                System.out.println(Integer.parseInt(rstr));
            }
        }
} 