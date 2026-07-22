/* WRITE A JAVA PROGRAM TO FIND ODD OR EVEN NUMBER USING USER INPUT. */

import java.util.Scanner;

class U1P8_2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER A NUMBER: ");
        int num = sc.nextInt();

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