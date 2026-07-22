/*Write a Java program to get different values from user at runtime using Scanner. */

import java.util.Scanner;

class U1P5 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter your height: ");
        int height = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter your gender: ");
        char gender = sc.next().charAt(0);

        System.out.println("\n User Details ");
        System.out.println("Name    : " + name);
        System.out.println("Age     : " + age);
        System.out.println("Height  : " + height + " meters");
        System.out.println("Gender  : " + gender);

        sc.close();
    }
}