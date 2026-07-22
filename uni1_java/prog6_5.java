/* Write a java program to take print number from user and print name using  WHILE loop. */

import java.util.Scanner;

class U1P6_5
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter how many times to print: ");
		int n=sc.nextInt();

		int i=1;

		while(i<=n)
		{
			System.out.println("DIGGI");
			i++;
		}
	}
}