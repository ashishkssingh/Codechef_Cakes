import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class chefsq
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
            Scanner sc=new Scanner(System.in);
		  int T=sc.nextInt();
                  
		  while(T--!=0)
                    {
		     int size=sc.nextInt();
		     long[] arr=new long[size];
		     for(int i=0;i<size;i++)
		     {
			   arr[i]=sc.nextInt();
		     }
		     int seq_size=sc.nextInt();
		     long[] m=new long[seq_size];
		     for(int i=0;i<seq_size;i++)
		      {
			    m[i]=sc.nextInt();
		      }
		     int k=0;
		     int f=0;
		     for(int i=0;i<size;i++)
			{
			if(arr[i]==m[k])
			{
			k++;
			f++;
			}
                    if(f==seq_size)
			{
                        break;
                        }
                    }
		     if(f==seq_size)
		    	  System.out.println("Yes");
		     else
		    	 System.out.println("No");
		     
		  }
		
		sc.close();
	  }
 
}  