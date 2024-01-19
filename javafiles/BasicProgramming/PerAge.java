package BasicProgramming;

//teen if age is between 13 and 19 inclusive.
//kid if less than 13.
//adult if more than 19.

import java.util.*;

public class PerAge {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the Age");
		
		int age = sc.nextInt();
		
		if(age>=13 && age<=19)
		{
			System.out.println("The person is Teen");
		}
		else if(age<13)
		{
			System.out.println("the person is Kid");
		}
		else
		{
			System.out.println("The person is Adult");
		}
		
	}

}
