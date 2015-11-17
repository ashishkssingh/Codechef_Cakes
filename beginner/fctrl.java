import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class fctrl
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
            Scanner sc = new Scanner(System.in);
            int test = Integer.parseInt(sc.nextLine());
            for(int i=0;i<test;i++){
                int count=5,sum=0;
                int n = Integer.parseInt(sc.nextLine());
                while(count<=n){
                sum+=n/count;
                count*=5;
                }
                System.out.println(sum);
            }
        }
} 