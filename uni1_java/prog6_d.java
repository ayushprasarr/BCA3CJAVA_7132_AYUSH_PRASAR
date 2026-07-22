/* Write a java program to print star pattern using loop. */

import java.util.Scanner;

class U1P6_d
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int n, i, j;

        System.out.print("Enter number: ");
        n = sc.nextInt();

        for(i = n; i >= 1; i--)
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