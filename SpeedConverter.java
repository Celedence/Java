public class SpeedConverter {

    public static long toMilesPerHour(double kilometerPerHor) {

        if(kilometerPerHor < 0) {
            return -1;
        }

        return Math.round(kilometerPerHor / 1.609);
    }

    public static void printConversion(double kilometerPerHor) {
        if(kilometerPerHor < 0) {
            System.out.println("Invalid value");
        } else {
            long MilesPerHour = toMilesPerHour(kilometerPerHor);
            System.out.println(kilometerPerHor + "km/h " + MilesPerHour + "mi/h");
        }
    }
}