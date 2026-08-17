/* WRITE A JAVA PROGRAM TO USE ABSTRACT CLASS */

import java.util.Scanner;

abstract class Calculate
{
    int a, b;

    void GetVal()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value1:");
        a = sc.nextInt();

        System.out.println("Enter value2:");
        b = sc.nextInt();
    }

    abstract void add();
    abstract void sub();
    abstract void mul();
    abstract void div();
    abstract void mod();
}

class Result extends Calculate
{
    void add()
    {
        System.out.println("The addition : " + (a + b));
    }

    void sub()
    {
        System.out.println("The subtraction : " + (a - b));
    }

    void mul()
    {
        System.out.println("The multiplication : " + (a * b));
    }

    void div()
    {
        System.out.println("The division : " + (a / b));
    }

    void mod()
    {
        System.out.println("The modulus : " + (a % b));
    }
}

class U2P4
{
    public static void main(String args[])
    {
        Result r = new Result();

        r.GetVal();
        r.add();
        r.sub();
        r.mul();
        r.div();
        r.mod();
    }
}