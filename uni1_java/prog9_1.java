/*  Write a java program to find out students result/grade using IF condition. */

import java.util.Scanner;

class U1P9_1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        String name, grade, result;
        int grno, c, advance_c, java, ds, html, total;
        float percentage;

        System.out.print("Enter GR No : ");
        grno = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Name : ");
        name = sc.nextLine();

        System.out.print("Enter C Marks : ");
        c = sc.nextInt();

        System.out.print("Enter Advance C Marks : ");
        advance_c = sc.nextInt();

        System.out.print("Enter JAVA Marks : ");
        java = sc.nextInt();

        System.out.print("Enter DS Marks : ");
        ds = sc.nextInt();

        System.out.print("Enter HTML Marks : ");
        html = sc.nextInt();

        total = c + advance_c + java + ds + html;
        percentage = total / 5.0f;  // I TOOK 5.F SO I CAN SHOW PERCENTAGE IN FLOATING POINT

        if (percentage >= 90)
            grade = "O";
        else if (percentage >= 80)
            grade = "A+";
        else if (percentage >= 70)
            grade = "A";
        else if (percentage >= 60)
            grade = "B+";
        else if (percentage >= 50)
            grade = "B";
        else if (percentage >= 40)
            grade = "C";
        else if (percentage >= 36)
            grade = "D";
        else
            grade = "F";

        if (c >= 36 && advance_c >= 36 && java >= 36 && ds >= 36 && html >= 36)
            result = "PASS";
        else
            result = "FAIL";

        System.out.println("--------------------------------");
        System.out.println("GR No       : " + grno);
        System.out.println("Name        : " + name);
        System.out.println("--------------------------------");
        System.out.println("C           : " + c);
        System.out.println("Advance C   : " + advance_c);
        System.out.println("JAVA        : " + java);
        System.out.println("DS          : " + ds);
        System.out.println("HTML        : " + html);
        System.out.println("--------------------------------");
        System.out.println("Total       : " + total + "/500");
        System.out.println("Percentage  : " + percentage + "%");
        System.out.println("Grade       : " + grade);
        System.out.println("Result      : " + result);

        sc.close();
    }
}