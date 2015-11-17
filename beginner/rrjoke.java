import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class rrjoke
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
            Scanner sc = new Scanner(System.in);
            int x[] = new int[10];
            int y[] = new int[10];
            int test = Integer.parseInt(sc.nextLine());
            while(test--!=0){
                int n = Integer.parseInt(sc.nextLine());
                int res=0;
                for(int i=1;i<=n;i++){
                    String str = sc.nextLine();
                    res^=i;
                }
                System.out.println(res);
            }
            sc.close();
    }  
} 