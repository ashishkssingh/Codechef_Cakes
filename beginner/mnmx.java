import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class mnmx
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
            Scanner sc = new Scanner(System.in);
            int test = sc.nextInt();
            for(int i=0;i<test;i++){
                int min;
                int size = sc.nextInt();
                int a[] = new int[size];
                for(int j=0;j<size;j++)
                    a[j] = sc.nextInt();
                
                min=a[0];
                
                for(int j=1;j<size;j++){
                if(a[j]<min)
                    min=a[j];
                }
                System.out.println((long)(size-1)*min);
            }
        }
} 