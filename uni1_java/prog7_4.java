/* WRITE A JAVA PROGRAM TO USE NESTED IF. */

import java.util.Scanner;

class U1P7_4
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER MARKS: ");
        int marks = sc.nextInt();

        if(marks >= 35)
        {
            if(marks >= 75)
            {
                System.out.println("EXCELLENT");
            }
            else
            {
                System.out.println("PASS");
            }
        }
        else
        {
            System.out.println("FAIL");
        }
    }
}