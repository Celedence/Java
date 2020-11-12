

public class Main {

    public static void main(String[] args) {
        sumDigits(125);


    }

    public static int sumDigits (int n) {

        int total = 0;
        if(n >= 10) {
            total += n;
            System.out.println("total is " + total);
            return total;
        } else {
            return -1;
        }
    }

}