//Lab 1
/*Write a program that prompts the user for a list of five integers. Place each of the numbers in a
separate variable:
a. Print each of the numbers separated by a space.
b. Print each of the numbers separated by a tab.
c. Print each of the numbers separated by a newline.*/

package Labs;

public class FiveIntegers
{

public static void main(String [] Args)



{
	/*Write a program that prompts the user for a list of five integers. Place each of the numbers in a
separate variable: */


	int a = 0,b = 0 ,c = 0,d = 0,e = 0;
	
	java.util.Scanner scanner = new java.util.Scanner(System.in);
	
	System.out.println("Please enter the first integer:");
	a = scanner.nextInt();
	
	System.out.println("Please enter the second integer:");
	b = scanner.nextInt();
	
	System.out.println("Please enter the third integer:");
	c = scanner.nextInt();
	
	System.out.println("Please enter the fouth integer:");
	d = scanner.nextInt();
	
	System.out.println("Please enter the fifth integer:");
	e = scanner.nextInt();
	
	scanner.close();
	
	// a. Print each of the numbers separated by a space.

	
	System.out.println();
	System.out.println(a + " " + b + " " + c + " " + d + " " + e);
	System.out.println();
	
	//b. Print each of the numbers separated by a tab.
	
	System.out.println();
	System.out.println(a + "\t" + b + "\t" + c + "\t" + d + "\t" + e);
	System.out.println();
	
	//c. Print each of the numbers separated by a newline.
	
	System.out.println();
	System.out.println(a + "\n" + b + "\n" + c + "\n" + d + "\n" + e);
	System.out.println();
	
}
}