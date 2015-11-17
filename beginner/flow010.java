import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class flow010
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
            Scanner sc = new Scanner(System.in);
            int test = Integer.parseInt(sc.nextLine());
            for(int i=0;i<test;i++){
                String str = sc.nextLine();
                if(str.equals("B")||str.equals("b"))
                    System.out.println("BattleShip");
                else if(str.equals("C")||str.equals("c"))
                    System.out.println("Cruiser");
                else if(str.equals("D")||str.equals("d"))
                    System.out.println("Destroyer");
                else
                    System.out.println("Frigate");
            }
        }
} 