import java.util.*;
import java.lang.*;
import java.io.*;
// In java we create an object of the class with the new than we access it 
// but once we marke it static we can use it without creating an object 

class Counter{
    static int count=0;
    Counter(){
        count++;
    }
}
class Student {
    // so in this student class i have 
    // two variables roll no and the school and 
    // one is static and one is non-static that means 
    // each object will get its own copy of rollno bt 
    // in the case of school the class Student itself 
    // gets only one copy of that variable and all the 
    // objects share it that's why when i changes the 
    // name of the school with s1 it also reflected in the s2 
    int rollNo;         // non-static (instance variable)
    static String school = "ABC School"; // static (class variable)
    static {
        System.out.println("the class is loaded into the memory once");
    }
    Student(int r) {
        rollNo = r;
    }

    void display() {
        System.out.println("Roll: " + rollNo + ", School: " + school);
    }
}
class Outer {
    static class Inner {
        void show() {
            System.out.println("Inside static nested class");
        }
    }
}
class MathUtils {
    // static method can be called without making an object of the class
    static int square(int x) {
        return x * x;
    }
}
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Counter c1=new Counter();
	Counter c2=new Counter();
	Counter c3=new Counter();
	System.out.println(Counter.count);
	Student s1=new Student(1);
	Student s2=new Student(2);
	s1.display();
	s2.display();
	s1.school="XYZ school";
	s1.display();
	s1.display();
	int result=MathUtils.square(55);
	System.out.println("result = "+result);
	
	 Outer.Inner obj = new Outer.Inner();
	 obj.show();

	}
}
