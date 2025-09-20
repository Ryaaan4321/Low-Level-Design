import java.util.*;
import java.lang.*;
import java.io.*;

abstract class Animal{
    abstract void makeSound();
    void sleep(){
        System.out.println("sleeping..........!");
    }
}
class Dog extends Animal{
    @Override
    void makeSound(){
        System.out.println("Dog Barks......!");
    }
}
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Dog d=new Dog();
		d.makeSound();
		d.sleep();

	}
}
