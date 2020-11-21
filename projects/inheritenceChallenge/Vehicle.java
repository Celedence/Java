public class Vehicle {

    private int move;
    private String steer;
    private int wheels;
    private int doors;
    private int windows;

    private int currentVolicity;
    private String currentDirection;
    

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;

        this.currentVolicity = 0;
        this.currentDirection = "north";
    }

    public void steer(int direction) {
        this.currentDirection += direction;
        System.out.println("Vehicle steer(). Steering at " + currentDirection + " degrees");
    }

    public void move(int velocity, int direction) {
        currentDirection = direction;
        currentVolicity = velocity;
        System.out.println("Vehicle move(). Moving at " + currentVolicity + " in direction " + currentDirection);
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }
    
    public int getCurrentVelocity() {
        return currentVolicity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void stop() {
        this.currentVolicity = 0;
    }
}
