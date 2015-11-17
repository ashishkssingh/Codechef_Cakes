    import java.util.*;
    import java.lang.*;
    import java.io.*;
     
    /* Name of the class has to be "Main" only if the class is public. */
    class intest
    {
    	public static void main (String[] args) throws java.lang.Exception
    	{
    		// your code goes here
                Scanner sc = new Scanner(System.in);
                int test = sc.nextInt();
                int num = sc.nextInt();
                int count=0;
                while(test--!=0){
                long a = sc.nextInt();
                if(a%num==0)
                    count++;
                else
                    continue;
                }
                System.out.println(count);
    	}
    } 