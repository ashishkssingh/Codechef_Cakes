import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class missp
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
            Scanner sc = new Scanner(System.in);
            int test = sc.nextInt();
            while(test--!=0){
                int size = sc.nextInt();
                int a[] = new int[size];
                for(int i=0;i<size;i++){
                    a[i]=sc.nextInt();
                }
                for(int i=0;i<size;i++){
			int k;
			k=a[i];
			int count=0;
			for(int j=0;j<size;j++){
				if(k==a[j]) count++;
			}
			if(count%2!=0){
				System.out.printf("%d\n",k);
				break;
			}
		}
 
        }
            sc.close();
    }  
} 