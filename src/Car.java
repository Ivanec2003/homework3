public class Car {
    private String mark;
    private int enginePower;
    private int tankVolume;
    public Car(String mark, int enginePower, int tankVolume){
        this.mark = mark;
        this.enginePower = enginePower;
        this.tankVolume = tankVolume;
    }
    public void startEngine(){
        System.out.println("Engine was started");
    }
    public void turnOffCar(){
        System.out.println("Car was turned off");
    }
    public void giveFuel(){
        System.out.println("Fuel was given");
    }
    public void getInfo(){
        System.out.println("Mark of car: " + mark);
        System.out.println("Power of engine: " + enginePower);
        System.out.println("Volume of tank: " + tankVolume);
        System.out.println("---------------------");
    }
}
