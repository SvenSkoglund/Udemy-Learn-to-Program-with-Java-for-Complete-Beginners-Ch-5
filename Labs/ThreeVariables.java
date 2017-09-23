//Lab 1
/*
Write a program that prompts the user for an integer department number, a floating-point salary, and
an integer job class. Put each of the items in a separate variable:
a. Print each of the items and a string literal label separated by a space.
b. Print each of the items and a string literal label separated by a tab.
c. Print each of the items and a string literal label separated by a newline
*/


package Labs;

public class ThreeVariables
{

public static void main(String [] Args)



{
/*
Write a program that prompts the user for an integer department number, a floating-point salary, and
an integer job class. Put each of the items in a separate variable:
*/


	int department = 0, jobClass = 0;
	float salary = 0;
	
	java.util.Scanner scanner = new java.util.Scanner(System.in);
	
	System.out.println();
	System.out.print("Please enter the department number:");
	department = scanner.nextInt();
	
	System.out.println();
	System.out.print("Please enter the salary:");
	salary = scanner.nextFloat();
	
	System.out.println();
	System.out.print("Please enter the job class number:");
	jobClass = scanner.nextInt();
	
	scanner.close();
	
	// a. Print each of the numbers separated by a space.

	
	System.out.println();
	System.out.println("Department: " + department + " Salary: " + salary + " Job Class: " + jobClass);
	System.out.println();
	
	//b. Print each of the numbers separated by a tab.
	
	System.out.println();
	System.out.println("Department: " + department + "\tSalary: " + salary + "\tJob Class: " + jobClass);
	System.out.println();
	
	//c. Print each of the numbers separated by a newline.
	
	System.out.println();
	System.out.println("Department: " + department + "\nSalary: " + salary + "\nJob Class: " + jobClass);
	System.out.println();
	
}
}