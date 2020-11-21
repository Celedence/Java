public class Dog extends Animal {


    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;


    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        //super intializes inherited class
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew() {
        System.out.println("chewing is called");
    }

    @Override
    public void eat() {
        System.out.println("dog eat is called from dog");
        chew();
        super.eat();
    }
    
    public void walk() {
        System.out.println("dog walk is called from the dog class");
        move(5);
    }


    public void run() {
        System.out.println("dog run is called from the dog class");
        move(10);
    }

    public void moveLegs(int speed) {
        System.out.println("move legs is called");
    }

    @Override
    public void move(int speed) {
        System.out.println("dog.move is called");
        moveLegs(speed);
        super.move(speed);
    }
}
