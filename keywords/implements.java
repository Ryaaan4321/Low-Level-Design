import java.util.*;
import java.lang.*;
import java.io.*;

interface Animal {
    void eat();
    default void sleep() {
        System.out.println("Zzz...");
    }
}

class Elephant implements Animal {  
    @Override
    public void eat() {
        System.out.println("Elephant eats");
    }
}
interface Swimmer {
    void swim();
}
class Dolphin implements Animal, Swimmer {
    @Override
    public void eat() { System.out.println("Dolphin eats"); }
    @Override
    public void swim() { System.out.println("Dolphin swims"); }
}

