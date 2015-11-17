import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class tlg
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
            Scanner sc = new Scanner(System.in);
            int p1=0,p2=0,win=0,winmax=0;
            int test = sc.nextInt();
            int lead=0;
            for(int i=0;i<test;i++){
                p1 += sc.nextInt();
                p2 += sc.nextInt();
                
                if(p1>p2){
                    lead=p1-p2;
                    if(lead>winmax){
                    win=1;
                    winmax=lead;
                    }
                }
                else{
                    lead=p2-p1;
                    if(lead>winmax){
                    win=2;
                    winmax=lead;
                    }
                }
            }
            System.out.println(win+" "+winmax);
	}
}
 