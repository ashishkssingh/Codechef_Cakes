     
    import java.util.*;
    import java.lang.*;
    import java.io.*;
     
    /* Name of the class has to be "Main" only if the class is public. */
    class fsqrt
    {
    	public static void main (String[] args) throws java.lang.Exception
    	{
    		// your code goes here
                Scanner sc = new Scanner(System.in);
                int test =sc.nextInt();
                for(int i=0;i<test;i++){
                    int number = sc.nextInt();
                    System.out.println((int)Math.sqrt(number));
                }
    	}
    } 