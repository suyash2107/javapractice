public class  DayFour{
    public static void main(String[] args) {
        // *** Widening (Implicit) Type Casting ***
        byte b = 10;
        short s = b;   // byte to short
        int i = s;     // short to int
        long l = i;    // int to long
        float f = l;   // long to float
        double d = f;  // float to double
        
        char c = 'A';  // 'A'  ASCII value 65
        int charToInt = c; // char to int

        // *** Narrowing (Explicit) Type Casting ***
        double d1 = 99.99;
        float f1 = (float) d1; // double to float
        long l1 = (long) f1;   // float to long
        int i1 = (int) l1;     // long to int
        short s1 = (short) i1; // int to short
        byte b1 = (byte) s1;   // short to byte

        int charToIntNarrow = (int) c; // char to int explicitly

        // *** Printing Values ***
        System.out.println("Widening (Implicit) Type Casting:");
        System.out.println("byte to short: " + s);
        System.out.println("short to int: " + i);
        System.out.println("int to long: " + l);
        System.out.println("long to float: " + f);
        System.out.println("float to double: " + d);
        System.out.println("char to int (ASCII of 'A'): " + charToInt);

        System.out.println("\nNarrowing (Explicit) Type Casting:");
        System.out.println("double to float: " + f1);
        System.out.println("float to long: " + l1);
        System.out.println("long to int: " + i1);
        System.out.println("int to short: " + s1);
        System.out.println("short to byte: " + b1);
        System.out.println("char to int explicitly: " + charToIntNarrow);
    }
}
