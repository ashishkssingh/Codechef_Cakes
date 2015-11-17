    import java.util.Scanner;
    import java.io.*;
    class luckfour{
    	public static void main(String[] args){
    		Scanner sc = new Scanner(System.in);
    		int test = sc.nextInt();
                    for(int i=0;i<test;i++){
                        int count=0;
                        int number = sc.nextInt();
                        while(number!=0){
                        int rem = number%10;
                        if(rem == 4){
                            count++;
                        }
                        number/=10;
                        }
                        System.out.println(count);
                    }
    	}
    } 