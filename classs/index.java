class Car{
    int chairs;
    int tyres;
    int speed;
    int gears;
    Car(){
        chairs=0;
        tyres=0;
        speed=0;
        gears=0;
    }
}
class Main {
    public static void main(String[] args) {
        Car c=new Car();
        c.chairs=4;
        c.tyres=4;
        c.speed=700;
        c.gears=4;
        
        System.out.println(c.chairs);
    }
}