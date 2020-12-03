
public class Main{

    public static void main(String[] args) {

        Penguin pickles = new Penguin("bob");

        pickles.name();
        
        Pickles playerOne = new Pickles("bob", "forward", "happy", "quick", 100);

        playerOne.fall();
        playerOne.getHealth();
        playerOne.attack();
        playerOne.setName("Peaches");
        playerOne.getName();



        Peaches playerTwo = new Peaches("playerTwo");

        playerTwo.printName();
    }

}