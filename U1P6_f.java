/* Write a java program to print number pattern using loop. */

import java.util.Scanner;

class U1P6_f
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int n, i, j;

        System.out.print("Enter number: ");
        n = sc.nextInt();

        for(i = 1; i <= n; i++)
        {
            for(j = 1; j <= i; j++)
            {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}