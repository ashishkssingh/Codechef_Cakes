import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class cookmach
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
            int test,s,d;
		Scanner in = new Scanner (System.in);
		test=in.nextInt();
		for(int i=0;i<test;i++)
		{	int count=0;
			s=in.nextInt();
			d=in.nextInt();
			while(s!=d){
                        if(d%s==0)
                            s*=2;
                        else
                            s/=2;
                        count++;
                        }
                        System.out.println(count);
                    }
	}
} 