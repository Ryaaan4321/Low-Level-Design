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
    public void blow_horn(){
        System.out.println("blowing horn!");
    }
    public void turn_on(){
        System.out.println("turning on the engine!");
    }
    public void turn_off(){
        System.out.println("turning off the engine!");
    }
}
class Main {
    public static void main(String[] args) {
        Car alto=new Car();
        alto.turn_off();
        alto.turn_on();
        Car mercdes=new Car();
        mercdes.turn_off();
        mercdes.turn_on();
        mercdes.chairs=4;
        mercdes.tyres=4;
        mercdes.speed=400;
        mercdes.gears=5;
        alto.chairs=4;
        alto.tyres=4;
        alto.speed=200;
        alto.gears=4;
        
        System.out.println(alto.chairs);
    }
}