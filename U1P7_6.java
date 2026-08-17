/* WRITE A JAVA PROGRAM TO USE NESTED IF ELSE. */

import java.util.Scanner;

class U1P7_6
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER A NUMBER: ");
        int num = sc.nextInt();

        if(num > 50)
        {
            if(num > 100)
            {
                System.out.println("NUMBER IS GREATER THAN 100");
            }
            else
            {
                System.out.println("NUMBER IS BETWEEN 51 ND 100");
            }
        }
        else
        {
            if(num < 50)
            {
                System.out.println("NUMBER IS LESS THAN 50");
            }
            else
            {
                System.out.println("NUMBER IS 50");
            }
        }
    }
}