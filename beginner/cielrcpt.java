import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class cielrcpt
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
            Scanner sc = new Scanner(System.in);
            int x[] = new int[10];
            int y[] = new int[10];
            int test = Integer.parseInt(sc.nextLine());
            while(test--!=0){
                long price = sc.nextInt();
                int count=0;
                while(price!=0){
                    if(price>=2048){
                        count+=price/2048;
                        price%=2048;
                    }
                    if(price>=1024){
                        count+=price/1024;
                        price%=1024;
                    }
                    if(price>=512){
                        count+=price/512;
                        price%=512;
                    }
                    if(price>=256){
                        count+=price/256;
                        price%=256;
                    }
                    if(price>=128){
                        count+=price/128;
                        price%=128;
                    }
                    if(price>=64){
                        count+=price/64;
                        price%=64;
                    }
                    if(price>=32){
                        count+=price/32;
                        price%=32;
                    }
                    if(price>=16){
                        count+=price/16;
                        price%=16;
                    }
                    if(price>=8){
                        count+=price/8;
                        price%=8;
                    }
                    if(price>=4){
                        count+=price/4;
                        price%=4;
                    }
                    if(price>=2){
                        count+=price/2;
                        price%=2;
                    }
                    else{
                        count+=price/1;
                        price%=1;
                    }
                }
                System.out.println(count);
            }
            sc.close();
    }  
} 