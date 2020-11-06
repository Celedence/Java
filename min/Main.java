import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int min = 0;
        int max = 0;
        boolean first = true;
        int subTotal = 0;

        while(subTotal <= 100) {
            System.out.println("Enter number: ");
            boolean isAnInt = scanner.hasNextInt();

            if(isAnInt) {
                int number = scanner.nextInt();

                if(first) {
                    first = false;
                    min = number;
                    max = number;
                }
                if(number > max) {
                    max = number;
                    subTotal += max;
                }

                if(number < min) {
                    min = number;
                    subTotal += min;
                }

            } else {

            }
            

            scanner.nextLine();  //handle input;
     
        }

        System.out.println("min= " + min + " max= " + max);
        


        scanner.close();

    }
}