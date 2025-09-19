import java.util.*;
import java.lang.*;
import java.io.*;

class Singelton{
    private static Singelton instance;
    private Singelton(){};
    public static Singelton getInstance(){
        if(instance==null){
            instance=new Singelton();
        }
        return instance;
    }
}

class Main {
    public static void main(String[] args) {
        Singelton s1=Singelton.getInstance();
        Singelton s2=Singelton.getInstance();
        System.out.println(s1);
        System.out.println(s2);
    }
}