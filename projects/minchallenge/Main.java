
public class Main {

    public static void main(String[] args) {

        getDurationString(150, 30);
        getDurationString(23);
    }

    public static int getDurationString(int minutes, int seconds) {

        if((minutes <= 0) && ((seconds <=0) && (seconds <=59))) {
            return -1;
        } else {
            int hours = minutes / 60;
            System.out.println("There are " + hours + " hours in " + minutes + " minutes");
            return hours;
        }

    }
    public static int getDurationString(int minutes) {

        if(minutes <= 0) {
            return -1;
        } else {
            int seconds = minutes * 60;
            System.out.println("There are " + seconds + " seconds in " + minutes + " minutes");
            return seconds;
        }
    }
}