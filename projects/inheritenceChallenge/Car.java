public class Car extends Vehicle {

    private boolean isFast;
    private boolean isEconomic;
    private boolean hasAc;
    private String color;
    private int weight;
    private String wheels;
    private boolean isManual;

    private int currentGear;       



    public Car(boolean isFast, boolean isEconomic, boolean hasAc, String color, int weight,String wheels, boolean isManual) {
        super(name, size);

        this.isFast = isFast;
        this.isEconomic = isEconomic;
        this.hasAc = hasAc;
        this.color = color;
        this.weight = weight;
        this.wheels = wheels;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Car.setCurrentGear(): Changed to " + this.currentGear + " gear.");
    }

    public void changeVelocity(int speed, int direction) {
        move(speed, direction);
        System.out.println("Car.changeVelocity(): Changed to " + speed + " mph.");
    }

    

}
