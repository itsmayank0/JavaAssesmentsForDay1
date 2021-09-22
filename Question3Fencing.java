package nIIT;

import java.util.Scanner;

public class Question3Fencing {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Select an option from list to calculate area of fence");
		System.out.println("1. Square area for the chickens");
		System.out.println("2. Circular area for ducks");
		System.out.println("3. Rectangular area for cows");
		
		int choice = sc.nextInt();
		switch(choice)
		{
		case 1:
			System.out.print("Enter side of square : ");
			float x = sc.nextFloat();
			area(x);
			break;
		case 2:
			System.out.print("Enter the redius of circle :");
			double redius = sc.nextDouble();
			area(redius);
			break;
		case 3:
			System.out.print("Enter the length of rectangle :");
			float len = sc.nextFloat();
			System.out.print("Enter the breadth of rectangle :");
			float bre = sc.nextFloat();
			area(len, bre);
		}

	}
	
	public static void area(float x)
    {
        System.out.println("Area of square fence for chickens "+Math.pow(x, 2));
    }
	public static void area(float x, float y)
    {
        System.out.println("Area of square fence for cows "+x*y);
    }
	public static void area(double x)
    {
        double z = 3.14 * x * x;
        System.out.println("Area of square fence for ducks "+z);
    }

}
