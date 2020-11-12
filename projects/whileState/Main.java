

public class Main {

    public static void main(String[] args) {
        int count = 1;
        while(count != 6) {
            System.out.println("Count value is " + count);
            count++;
        }
        int total = add(4,6);
        System.out.println("the total is " + total);

        boolean result = isEvenNumber(20);
        System.out.println(result);

    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static boolean isEvenNumber(int number) {
        if(number % 2 == 0){
            return true;
        } else {
        
        int num = 0;
        while(num < 15) {
            numb++;
        }
        if (num <=5) {
            System.out.println("skipping number " + num);
            continue;
        }
        System.out.println("numbers = " + num);

        if (num >=10) {
            System.out.println("Breaking at " + num);
            break;
        }
    }
}

