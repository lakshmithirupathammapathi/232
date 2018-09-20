import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc=new Scanner(System.in);
		int Num1, Num2, i, GCD = 0;
	
		
	
		Num1 = sc.nextInt();	
		
	
		Num2 = sc.nextInt();
		
		for(i = 1; i <= Num1 && i <= Num2; i++)
	    {
	        if(Num1 % i == 0 && Num2 % i == 0)
	        {
	            GCD = i;
	        }
	    }	
		System.out.println( GCD);
	}
}
	
