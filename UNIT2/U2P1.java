/* WRITE A JAVA PROGRAM TO USE SIMPLE INHERITANCE. */

class Animal
{
    void eat()
    {
        System.out.println("Animal eats food.");
    }
}

class Dog extends Animal
{
    void bark()
    {
        System.out.println("Dog barks.");
    }
}

class U2P1
{
    public static void main(String args[])
    {
        Dog d = new Dog();

        d.eat();
        d.bark();
    }
}