import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class flow005
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
            Scanner sc = new Scanner(System.in);
            int test =Integer.parseInt(sc.nextLine());
            for(int i=0;i<test;i++){
                int count =0;
                int num = sc.nextInt();
                if(num>=100){
                    count+=num/100;
                    num%=100;
                }
                if(num>=50){
                    count+=num/50;
                    num%=50;
                }
                if(num>=10){
                    count+=num/10;
                    num%=10;
                }
                if(num>=5){
                    count+=num/5;
                    num%=5;
                }
                if(num>=2){
                    count+=num/2;
                    num%=2;
                }
                System.out.println(count+num);
            }
        }
} 