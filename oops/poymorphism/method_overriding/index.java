import java.util.*;
import java.lang.*;
import java.io.*;

class Veichle{
    void start(){
        System.out.println("starting a generic Veichle!");
    }
}
class Truck extends Veichle{
    @Override
    void start(){
        System.out.println("starting a Truck!");
    }
}
class Car extends Veichle{
    @Override
    void start(){
        System.out.println("starting a car!");
    }
}
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Veichle v=new Veichle();
		v.start();
		Veichle t=new Truck();
		Veichle c=new Car();
		c.start();
		t.start();

	}
}
