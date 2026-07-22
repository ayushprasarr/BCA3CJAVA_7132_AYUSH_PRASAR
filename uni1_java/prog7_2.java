/* WRITE A JAVA PROGRAM TO USE IF ELSE CONDITION. */

import java.util.Scanner;

class U1P7_2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER ATTENDENCE: ");
        int attendence = sc.nextInt();

        if(attendence >= 75)
        {
            System.out.println("ELIGIBLE FOR EXAM");
        }
        else
        {
            System.out.println("NOT ELIGIBLE FOR EXAM");
        }
    }
}