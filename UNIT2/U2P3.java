/* WRITE A JAVA PROGRAM TO USE HIERARCHICAL INHERITANCE */

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

class Cat extends Animal
{
    void meow()
    {
        System.out.println("Cat meows.");
    }
}

class U2P3
{
    public static void main(String args[])
    {
        Dog d = new Dog();
        Cat c = new Cat();

        d.eat();
        d.bark();

        c.eat();
        c.meow();
    }
}