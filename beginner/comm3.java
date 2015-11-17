import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class comm3
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
            Scanner sc = new Scanner(System.in);
            int test = sc.nextInt();
            while(test--!=0){
                int count=0;
                int r =sc.nextInt();
                int x1=sc.nextInt();
                int y1=sc.nextInt();
                int x2=sc.nextInt();
                int y2=sc.nextInt();
                int x3=sc.nextInt();
                int y3=sc.nextInt();
                float d1=(float) Math.sqrt(Math.pow((x1-x2), 2)+Math.pow(y1-y2, 2));
                float d2=(float) Math.sqrt(Math.pow((x2-x3), 2)+Math.pow(y2-y3, 2));
                float d3=(float) Math.sqrt(Math.pow((x1-x3), 2)+Math.pow(y1-y3, 2));
                if(d1<=r)
            {
                if(d2<=r||d3<=r)
                    System.out.println("yes");
                else
                    System.out.println("no");
            }
            else
            {
                if(d2<=r&&d3<=r)
                    System.out.println("yes");
                else
                    System.out.println("no");
            }
        }
            sc.close();
    }  
} 