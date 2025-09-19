import java.util.*;
import java.lang.*;
import java.io.*;

// - By changing the return type of the arguments
class Emplloyee{
    int add(int bikecost,int carcost){
        return bikecost+carcost;
    }
    double add(double a,double b){
        return a+b;
    }
    int add(int bikecost){
      return bikecost;
      }
}
// - By increasing or decreasing the number of arguments
class Veichle{
    void start(String veichleType){
        System.out.println(" starting a " + veichleType);
    }
    void start(String veichleType,int speed){
        System.out.println("Starting a "+ veichleType + "with a speed of " + speed);
    }
}

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Veichle v=new Veichle();
		Emplloyee e=new Emplloyee();
		int int_addition = e.add(34,56);
		double double_addition=e.add(3.00,7.00);
        int add=e.add(800);
		System.out.println(add);
		System.out.println(int_addition);
		System.out.println(double_addition);
		v.start("auto");
		v.start("auto ", 30);

	}
}
