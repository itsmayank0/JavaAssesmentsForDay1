package nIIT;

import java.util.Scanner;

public class Question4Hourly 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter name of the employee ");
		
		String nameEmp = sc.next();
		
		System.out.println("Enter base pay of the employee ");
		
		double basePay = sc.nextDouble();
		
		System.out.println("Enter number of hours worked by the employee ");
		
		int hours = sc.nextInt();
		
		System.out.println("Name :: "+nameEmp);
		System.out.println("Base pay :: "+basePay+"$");
		System.out.println("Hours worked :: "+hours);
		
		if(hours>40) 
		{
			double sal = 40*basePay + ((hours-40)*basePay*2);
			System.out.println("Salary of employee :: "+sal+"$");
		}
		else 
		{
			double sal = 40*basePay;
			System.out.println("Salary of employee :: "+sal+"$");
		}
	}

}
