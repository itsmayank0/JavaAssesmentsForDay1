package nIIT;

import java.util.*;
public class Question1Swapping 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		StringBuilder s = new StringBuilder(sc.nextLine());
		try 
		{
			if(s.length()%2==0) 
			{
				for(int i=0; i<s.length(); i+=2)
				{
					char temp1Char = s.charAt(i);
					char temp2Char = s.charAt(i+1);
					String tempS = Character.toString(temp2Char) + Character.toString(temp1Char);
					s.replace(i, i+2, tempS);
				}
			}
			else
			{
				for(int i=1; i<s.length(); i+=2)
				{
					char temp1Char = s.charAt(i);
					char temp2Char = s.charAt(i+1);
					String tempS = Character.toString(temp2Char) + Character.toString(temp1Char);
					s.replace(i, i+2, tempS);
				}
			}
			System.out.println(Integer.parseInt(s.toString()));
		}
		catch(Exception e)
		{
			System.out.println("Please Enter a valid number!!");
		}
		sc.close();
	}

}
