import java.util.*;
import java.lang.*;
import java.io.*;

class Animal{
    void eat(){
        System.out.println("animal eats food!");
    }
}
class Cat extends Animal{
    @Override
    void eat(){
        System.out.println("Cat eats!");
    }
}
class Dog extends Animal{
    @Override
    void eat(){
        System.out.println("Dog eats");
    }
}
// this is not supported in jave tho bt if we see carefully 
// than it created ambiguity that Hybrid.soun() will call which 
// will it call the function fromt the cat or will it call the function
// from the dog and this is what Diamond Problem is if java allowed it in 
// in this way
class HybirdAnimal extends Dog,Cat{
    public static void main(String[] args){
        HybirdAnimal hybrid = new HybirdAnimal();
        hybrid.sound();   
    }
}

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
     Dog d=new Dog();
     Cat c=new Cat();
     d.eat();
     c.eat();

	}
}
