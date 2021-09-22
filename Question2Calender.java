package nIIT;

import java.util.Scanner;

public class Question2Calender {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Month : ");
		int M = sc.nextInt();
		
		System.out.println("Enter Year : ");
		int Y = sc.nextInt();
		
		System.out.println("Enter Day of Week : ");
        int startDayOfMonth = sc.nextInt();
        
        int spaces = startDayOfMonth;

        int[] days = {
            0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
        };
        
        if(M <= 12) 
        {

        
            if  ((((Y % 4 == 0) && (Y % 100 != 0)) ||  (Y % 400 == 0)) && M == 2)
                days[M] = 29;

            System.out.println("   S    M   Tu    W   Th    F    S  ");

               spaces = (days[M-1] + spaces)%7;
            
            for (int i = 0; i < spaces; i++)
                System.out.print("     ");
            for (int i = 1; i <= days[M]; i++) 
            {
                System.out.printf(" %3d ", i);
                if (((i + spaces) % 7 == 0) || (i == days[M])) 
                	System.out.println();
            }
            
            System.out.println();
        }

	}
}

