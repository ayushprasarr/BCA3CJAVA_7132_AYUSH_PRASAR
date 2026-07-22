/* WRITE A JAVA PROGRAM TO TAKE A NAME FROM USER AND DISPLAY ON SCREEN. */

import java.util.Scanner;

class U1P2
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your name : ");
		String name = sc.nextLine();

		System.out.println("Your name is : " + name);

		sc.close();
	}
}