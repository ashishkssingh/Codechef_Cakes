import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class recipe
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
            Scanner sc = new Scanner(System.in);
            int test = Integer.parseInt(sc.nextLine());
            for(int i=0;i<test;i++){
                int size = sc.nextInt();
                int a[] = new int[size];
                for(int j=0;j<size;j++){
                    a[j]=sc.nextInt();
                }
                int n1 = a[0];
                for(int j=0;j<size;j++){
                    n1 = hcf(n1,a[j]);
                }
                for(int j=0;j<size;j++){
                    System.out.print(a[j]/n1+" ");
                }
                System.out.println();
            }
        }
        static int hcf(int a, int b){
            if(b==0)
                return a;
            else
                return hcf(b,a%b);
        }
} 