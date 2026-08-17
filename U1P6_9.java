/* Write a java program to get the name from user and take printing number from user using DO WHILE loop. */

import java.util.Scanner;

class U1P6_9
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter your name: ");
		String name=sc.nextLine();

		System.out.print("Enter how many times to print: ");
		int n=sc.nextInt();

		int i=1;

		do
		{
			System.out.println(name);
			i++;
		}
		while(i<=n);
	}
}