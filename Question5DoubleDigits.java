package nIIT;

import java.util.*;

public class Question5DoubleDigits
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num<0)
			System.out.println(-doubleDigits(-num));
		else
			System.out.println(doubleDigits(num));
		sc.close();
	}
	
	public static int doubleDigits(int n)
	{
		if(n==0)
			return 0;
		else
			return Integer.parseInt(Integer.toString(doubleDigits(n/10)) + Integer.toString(n%10) + Integer.toString(n%10));		
	}

}
