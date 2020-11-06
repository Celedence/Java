public class Min {
    

    public static void main(String[] args) {

        int valut = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("Integer Minimum Value " + myMinIntValue);
        System.out.println("Integer Minimum Value " + myMaxIntValue);
        System.out.println("Integer Minimum Value = " + (myMaxIntValue -1));

        byte minByteValue = Byte.MIN_VALUE;
        byte maxByteValue = Byte.MAX_VALUE;

        System.out.println("Min Byte Value is = " + minByteValue);
        System.out.println("Max Byte Value is = " + maxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;

        System.out.println("Short Minimum Value is = " + myMinShortValue);
        System.out.println("Short Maximum Value is = " + myMaxShortValue);

        long myLongValue = 100L;

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value is = " + myMinLongValue);
        System.out.println("Long Maximum Value is = " + myMaxLongValue);


    }
}