import java.util.*;
import java.lang.*;
import java.io.*;

interface Animal {
// Interface methods without a body (void eat()) 
// are public abstract → must be implemented as public.
// Interface methods with default have a body → they are already public, 
// and implementing classes don’t need to override them unless they want custom behavior.
// default ≠ changing visibility; it’s just a default implementation.
    void eat(); 
    default void sleep() {
        System.out.println("Zzz...");
    }
}
class Elephant implements Animal{
    @Override
    public void eat(){
        System.out.println("elephant eats the vegetarian food!");
    }
}
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	   Elephant e=new Elephant();
	   e.eat();
	   e.sleep();
	}
}
