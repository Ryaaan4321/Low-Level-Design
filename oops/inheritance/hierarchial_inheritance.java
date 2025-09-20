import java.util.*;
import java.lang.*;
import java.io.*;

class Animal{
    void eat(){
        System.out.println("animal eats food!");
    }
}
class Cat extends Animal{
    void meow(){
        System.out.println("Cat meow!");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Dog barks!");
    }
}
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
     Dog d=new Dog();
     Cat c=new Cat();
     d.bark();
     d.eat();
     c.meow();
     c.eat();

	}
}
