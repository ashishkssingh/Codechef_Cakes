     
    import java.util.*;
    import java.lang.*;
    import java.io.*;
     
    /* Name of the class has to be "Main" only if the class is public. */
    class flow006
    {
    	public static void main (String[] args) throws java.lang.Exception
    	{
    		// your code goes here
                Scanner sc = new Scanner(System.in);
                int test =Integer.parseInt(sc.nextLine());
                for(int i=0;i<test;i++){
                    int num = sc.nextInt();
                    int sum=0;
                    while(num!=0){
                    sum+=num%10;
                    num/=10;
                    }
                    System.out.println(sum);
                }
            }
    } 