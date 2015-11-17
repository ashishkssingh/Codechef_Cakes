import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class prb01
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
            Scanner sc = new Scanner(System.in);
            int test = Integer.parseInt(sc.nextLine());
            for(int i=0;i<test;i++){
                int flag=0;
                int num = sc.nextInt();
                if(num==1)
                    System.out.println("no");
                else{
                    for(int j=2;j<num/2;j++){
                        if(num%j == 0){
                            flag=1;
                            break;
                        }
                    }
                    if(flag == 1)
                        System.out.println("no");
                    else
                        System.out.println("yes");
                }
            }
        }
} 