import java.util.Scanner;

import mypackage.Addition;
import mypackage.Subtraction;
import mypackage.Multiplication;
import mypackage.Division;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        Addition add = new Addition();
        Subtraction sub = new Subtraction();
        Multiplication mul = new Multiplication();
        Division div = new Division();

        System.out.println("Addition = " + add.add(a, b));
        System.out.println("Subtraction = " + sub.sub(a, b));
        System.out.println("Multiplication = " + mul.mul(a, b));
        System.out.println("Division = " + div.div(a, b));

        sc.close();
    }
}
