/* Write a java program to take print number from user and print name using  FOR loop. */

import java.util.Scanner;

class U1P6_4
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter how many times to print: ");
		int n=sc.nextInt();

		int i;

		for(i=1;i<=n;i++)
		{
			System.out.println("DIGGI");
		}
	}
}