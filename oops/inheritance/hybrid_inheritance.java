import java.util.*;
import java.lang.*;
import java.io.*;

class Animal {
    void eat(){
        System.out.println("the animal eats his food!");
    }
}
interface Mamal{
    void walk();
}
interface Pet{
    void play();
}
class Dog extends Animal implements Mamal ,Pet{
    @Override 
    public void walk(){
        System.out.println("dog is mamal and  can walk!");
    }
    @Override
    public void play(){
        System.out.println("Dog is a pet and we can play with him!");
    }
}
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	   Dog d=new Dog();
	   d.eat();
	   d.play();
	   d.walk();
	}
}
