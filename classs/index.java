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
        Car alto=new Car();
        Car mercdes=new Car();
        mercdes.chairs=4;
        mercdes.tyres=4;
        mercdes.speed=400;
        mercdes.gears=5;
        alto.chairs=4;
        alto.tyres=4;
        alto.speed=200;
        alto.gears=4;
        
        System.out.println(c.chairs);
    }
}