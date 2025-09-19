import java.util.*;
import java.lang.*;
import java.io.*;

import java.util.*;
import java.lang.*;
import java.io.*;

abstract class Animal{
    String name;
    Animal(String name){
        this.name=name;
    }
    abstract void makeSound();
}
class Dog extends Animal{
    Dog(String name){
        super(name);
    }
    void makeSound(){
        System.out.println(name + " why are u  barking");
    }
}

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Animal a = new Dog("john");
		a.makeSound();
		

	}
}
