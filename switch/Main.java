

public class Main {

    public static void main(String[] args) {
        int value = 2;
        if(value ==1) {
            System.out.println("Value was 1");
        } else if(value ==2) {
            System.out.println("Value was 2");
        } else if(value ==3) {
            System.out.println("Value was 3");
        }

        int switchValue = 3;

        switch(switchValue) {
            case 1:
            System.out.println("Value was 1 ");
            break;

            case 2:
            System.out.println("Value was 2");
            break;

            default:
            System.out.println("Value was not 1 or 2");
            break;
        }   
    }
}