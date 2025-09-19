import java.util.*;
import java.lang.*;
import java.io.*;


class Parent {
    public final void showMessage() {
        System.out.println("This is final method, cannot be overridden.");
    }
}

class Child extends Parent {
    @Override
    public void showMessage(){
        System.out.println("method from the parent class");
    }
    // so if i try to do this i will get error tht the method that i tried to override is the final so it cannot be overriden
    
}
final class Vehicle {
    public void display() {
        System.out.println("Vehicle class");
        // and now this veichle class can not be extended this is how this final works
    }
}

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    final int x=10;
	   // x=20; 
	    // final variable value cannot be changed once assigned it means if it is 10 than it will be 10
	    final StringBuilder sb=new StringBuilder("Hello");
	    sb.append("world"); 
	    // but final allows modifying object not reference
	    System.out.println(sb);
	    System.out.println("x = "+ x);
	    
	    Child ch=new Child();
	    ch.showMessage();

	}
}
