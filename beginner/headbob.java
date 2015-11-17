import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class headbob
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
            Scanner sc = new Scanner(System.in);
            Short test = Short.parseShort(sc.nextLine());
            for(short i=0;i<test;i++){
                int size = Integer.parseInt(sc.nextLine());
                char temp=' ';
                String str = sc.nextLine();
                for(char ch: str.toCharArray()){
                    temp = ch;
                    if(ch=='I'||ch=='Y')
                        break;
                }
                if(temp=='I')
                    System.out.println("INDIAN");
                else if(temp=='Y')
                    System.out.println("NOT INDIAN");
                else
                    System.out.println("NOT SURE");
            }
        }
} 