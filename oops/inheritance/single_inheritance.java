import java.util.*;
import java.lang.*;
import java.io.*;

class Animal{
    void eat(){
        System.out.println("animal eats food!");
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
     d.eat();
     d.bark();

	}
}
