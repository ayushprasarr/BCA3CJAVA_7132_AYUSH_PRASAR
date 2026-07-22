/* Write a java program to get the name from user and print using loop. */

import java.util.Scanner;

class U1P6_b
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int i, j, n;

        System.out.print("ENTER NUMBER OF ROWS : ");
        n = sc.nextInt();

        for(i = 1; i <= n; i++)
        {
            for(j = 1; j <= n - i; j++)
            {
                System.out.print(" ");
            }

            for(j = 1; j <= i; j++)
            {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}