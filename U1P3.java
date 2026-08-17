/* WRITE A JAVA PROGRAM TO GET PERSONAL INFORMATION FROM USER AND DISPLAY ON SCREEN. */

import java.util.Scanner;

class U1P3
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ENTER YOUR NAME: ");
		String name = sc.nextLine();

		System.out.print("ENTER YOUR AGE: ");
		int age = sc.nextInt();
		sc.nextLine();

		System.out.print("ENTER YOUR GENDER: ");
		String gender = sc.nextLine();

		System.out.print("ENTER YOUR CITY: ");
		String city = sc.nextLine();

		System.out.print("ENTER YOUR MOBILE NO. : ");
		String mobile = sc.nextLine();
		
		System.out.println("NAME: " + name);
		System.out.println("AGE: " + age);
		System.out.println("GENDER: " + gender);
		System.out.println("CITY: " + city);
		System.out.println("MOBILE NO. : " + mobile);

		sc.close();
	}
}