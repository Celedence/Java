
public class Data {

    public static void main(String[] args) {
        //primitive data types built into java

        //byte
        //short
        //int
        //long
        //float
        //double
        // //char
        // //boolean
        // String myString = "my string is great";
        // System.out.println("My string says = " + myString);


        // int result = 1 + 2;
        // System.out.println("1 + 2 = " + result);
        // int previousResult = result;
        // System.out.println("previous result = " + previousResult);
        // result = result -1;
        // System.out.println("3 - 1 = " + result);

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien");  
        }

        boolean isCar = true;
        if (isCar) {
            System.out.println("this is not supposed to happen");
        }

        boolean wasCar = isCar ? true: false;
        if (wasCar) {
            System.out.println("wasCarr istrue");
        }


        double firstValue = 20.00d;
        double secondvalue = 80.00d;

        double total = (firstValue + secondvalue) * 100.00d;
        System.out.println("The total is " + total);
        double theRemainder = total % 40.00d;
        System.out.println("the remainder is = " + theRemainder);

        boolean isNoRemander = (theRemainder == 0 ? true: false);
        if(!isNoRemander) {
            System.out.println("Got some remainder");
        }

        



    }
}