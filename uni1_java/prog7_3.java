/* WRITE A JAVA PROGRAM TO USE IF ELSE IF ELSE CONDITION. */

import java.util.Scanner;

class U1P7_3
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
        else if(attendence >= 50)
        {
            System.out.println("ATTEND EXTRA CLASSES");
        }
        else
        {
            System.out.println("NOT ELIGIBLE FOR EXAM");
        }
    }
}