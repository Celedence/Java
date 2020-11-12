
public class Main {

    public static void main(String[] args) {
        calcFeetToInchesToCentimeters(5, 3);
        System.out.println("is this on" );
        calcFeetToInchesToCentimeters(3);
    }

    public static double calcFeetToInchesToCentimeters(int feet, int inches) {
        if((feet < 0)  && ((inches < 0) && (inches > 12))) {
            return -1;
        } else {
            double centimeters = (feet * 12) + 2.54;
            centimeters += inches * 2.54;
            System.out.println(feet + " feet, " + inches + " inches is " + centimeters + " cm");
            return centimeters;
        }
    }
    public static double calcFeetToInchesToCentimeters(double inches) {
        if(inches >= 0) {
            return -1;
        } else {
            double toCent = (inches * 2.54);
            System.out.println("This is working " + toCent);
            return toCent;
        }
    }
}