//3 Write a java program to get personal information from user and display on screen.

import java.util.Scanner;
       public class inputinfo
	   {
	           public static void main(String args[])
			   {
			           Scanner scn = new Scanner(System.in);
					   
					   System.out.println("Enter the name:");
					   String name = scn.nextLine();
					   
					   System.out.println("Enter the age:");
					   String age = scn.nextLine();
					   
					   System.out.println("Enter the mobile no. :");
					   String mn = scn.nextLine();
					   
					   System.out.println("Enter the email:");
					   String email = scn.nextLine();
					   
					   System.out.println("Enter the city:");
					   String city = scn.nextLine();
					   
					   scn.close();
					   
					   System.out.println("Entered name:" + name);
					   System.out.println("Entered name:" + age);
					   System.out.println("Entered mobile no.:" + mn);
					   System.out.println("Entered email:" + email);
					   System.out.println("Entered city:" + city);
			   }
	   }
	   