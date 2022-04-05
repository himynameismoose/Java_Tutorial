package Casting;

public class App {
    public static void main(String[] args) {

        byte byteValue = 20;
        short shortValue = 55;
        int intValue = 888;
        long longValue = 23355;

        float floatValue = 8834.8f;
        float floatValue2 = (float) 99.3; // cast, no f at the end
        double doubleValue = 32.4;

        System.out.println(Byte.MAX_VALUE); // 127

        intValue = (int) longValue;

        System.out.println(intValue);

        doubleValue = intValue;
        System.out.println(doubleValue);

        intValue = (int) floatValue;
        System.out.println(intValue); // will chop at the end, not round up

        // The following won't work as we expect it to!
        // 128 is too big for a byte.
        byteValue = (byte) 128;
        System.out.println(byteValue); // -128, min value
    }
}
