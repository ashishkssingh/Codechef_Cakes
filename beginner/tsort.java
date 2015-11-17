import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class tsort
{
    static int max = 1000000;
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int totalCases = Integer.parseInt(br.readLine().trim());
        int[] numbers = new int[max + 1];
        int value;
        for (int index = 0; index < totalCases; index++) {
            value = Integer.parseInt(br.readLine().trim());
            numbers[value] = numbers[value] + 1;
        }
        PrintWriter out=new PrintWriter(System.out);
        for (int i = 1; i <= max; i++) {
            if(numbers[i] > 0) {
                for (int j = 0; j < numbers[i]; j++) out.println(i);
            }
        }
        out.flush();
    }
} 