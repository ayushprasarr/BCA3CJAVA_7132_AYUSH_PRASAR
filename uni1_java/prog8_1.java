/* Write a java program find ODD or EVEN number using command line argument. */

import java.util.Scanner;

class U1P8_1
{
	public static void main(String args[])
	{
		int num = Integer.parseInt(args[0]);

		if(num % 2 == 0)
		{
			System.out.println("NUMBER IS EVEN");
		}
		else
		{
			System.out.println("NUMBER IS ODD");
		}
	}
}