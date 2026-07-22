import java.util.Scanner;

public class U1P3_2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a value: ");
        String value = sc.nextLine();

        System.out.println("You entered: " + value);

        sc.close();
    }
}