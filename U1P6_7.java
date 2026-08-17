/* Write a java program to get the name from user and take printing number from user using FOR loop. */

import java.util.Scanner;

class U1P6_7
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter your name: ");
		String name=sc.nextLine();

		System.out.print("Enter how many times to print: ");
		int n=sc.nextInt();

		int i;

		for(i=1;i<=n;i++)
		{
			System.out.println(name);
		}
	}
}