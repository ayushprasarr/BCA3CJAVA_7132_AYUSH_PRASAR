/* WRITE A JAVA PROGRAM TO USE IF ELSE WITH NESTED IF. */

import java.util.Scanner;

class U1P7_5
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER MARKS: ");
        int marks = sc.nextInt();

        if(marks >= 35)
        {
            System.out.println("PASS");
        }
        else
        {
            if(marks >= 30)
            {
                System.out.println(" * REQUIRED");
            }
            else
            {
                System.out.println("FAIL");
            }
        }
    }
}