import java.util.*;
import java.lang.*;
import java.io.*;

class Animal{
    void eat(){
        System.out.println("animal eats food!");
    }
}
// why interface/abstract becuase class are not allowed t

interface Cat {
    default void eat(){
        System.out.println("cat eats mouse!");
    }
}
interface Dog{
    default void eat(){
        System.out.println("Dog eats cat!");
    };
}

class HybirdAnimal implements Dog,Cat{
    // it cuts off the ambiguity problem from it
    @Override
    public void eat(){
        Cat.super.eat();
    }
    public static void main(String[] args){
        HybirdAnimal hybrid = new HybirdAnimal();
        hybrid.eat();   
    }
}

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    HybirdAnimal h=new HybirdAnimal();
	    h.eat();
	}
}
