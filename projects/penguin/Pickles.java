
public class Pickles extends Penguin{

    private String move;
    private String dance;
    private String slide;
    private int health;
    
    public Pickles(String name, String move, String dance, String slide, int health) {
        super("pickles");
        this.move = move;
        this.dance = dance;
        this.slide = slide;
        this.health = 100;
    }

    public void fall() {
        this.health -= 30;
        System.out.println(name + " has fallen and lost 30 health" );
    }
    
    public void attack() {        
    }

    public int getHealth() {
        System.out.println("health is " + health);
        return this.health;
    }

    public String setName(String name) {
        System.out.println("name has been set to " + name);
        return this.name;
    }

    public void getName() {
        System.out.println("name is " + name);
    }
}
