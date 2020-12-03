public class Penguin {

    private static int winningScore;


    public String name;
    private int steps;



    public Penguin(String name) {
        this.name = name;
    }

    public void name() {
        System.out.println("The penguins name is " + name);
        //return name;
    }
     public void getName(){
         System.out.println(name);
     }

     public void attack() {
         winningScore += 10;
         System.out.println( name + " has attacked for 10 points");
         System.out.println(winningScore);
     }


    
}
