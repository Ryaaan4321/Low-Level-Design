import java.util.*;
import java.lang.*;
import java.io.*;

class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}
// Only single inheritance is allowed in Java with classes.
// You cannot do -  
// class Elephant extends Animal, Tiger {} — Java forbids multiple class inheritance.
class Elephant extends Animal {  
    @Override
    void eat() {
        System.out.println("Elephant eats");
    }
}
// abstract class also use extend
abstract class Animal {
    abstract void eat();
}
class Elephant extends Animal {  
    void eat() {
        System.out.println("Elephant eats");
    }
}
// So in simple words if we are inheriting from the single class than only we can use extend 
// use implement when inheriting from one or more interfaces!

