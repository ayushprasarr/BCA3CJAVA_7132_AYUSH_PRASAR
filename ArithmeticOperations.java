
//4.2 Write a java program to perform different arithmetic operations without using command line args.

import java.util.Scanner;
 public class ArithmeticOperations
 {
	 public static void main(String args[])
	 {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter first no.: ");
		 double num1 = sc.nextDouble();
		  
		  System.out.println("Enter second no.: ");
		 double num2 = sc.nextDouble();
		 
		 double addition = num1 + num2;
		 double subtraction = num1 - num2;
		 double multiplication = num1 * num2;
		 double divison = num1 / num2;
		 double modulus = num1 % num2;
		 
		  System.out.println("Addition : " + addition);
		  System.out.println("Subtraction : " + subtraction);
		  System.out.println("Multiplication : " + multiplication);
		  System.out.println("Divison : " + divison);
		  System.out.println("Modulus : " + modulus);
		  
		  sc.close();
	 }
 }	 