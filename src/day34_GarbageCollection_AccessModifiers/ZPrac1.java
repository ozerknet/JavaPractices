package day34_GarbageCollection_AccessModifiers;

public class ZPrac1 {
    public static void main(String[] args) {
        String str = "Wooden Spoon"; // after line 13, "Wooden Spoon" will be eligible for garbage collection
        str = null;

        System.out.println( str );
    }
}
