package nIIT;

import java.util.*;

public class Question6PHvalue 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int phValue = sc.nextInt();
		if(phValue<7) 
		{
			System.out.println("pH value is low, partial water change required");
		}
		else
		{
			if(phValue>=7 && phValue<=8)
			{
				System.out.println("pH value is fine");
			}
			else
				System.out.println("pH value is high, partial water change required");
		}
		sc.close();

	}

}
