public class StringExample1 {

    //STRING METHODS:

    /*length()-- returns count of total number of characters in the string including spaces.
     * charAt()-- returns a char value at the given index number.
     * concat()-- combines specified string at the end of the string.
     * contains()-- returns true if sequence of char values are found in the string otherwise returns false.
     * indexOf()-- returns the index within the calling String of the first
     * occurrence of the specified value, starting fromIndex.Returns -1 if the value is not found.

     * replace()-- returns a string replacing all the old char or CharSequence to new char or CharSequence
     * replaceFirst() --
     * equals()-- compares the two given string based on the content of the string
     *
     * substring()-- returns string’s substring that begins with the character at the
     * specified beginIndex and extends to the end of the string.
     *
     * toLowerCase()-- method returns the calling string value converted to lower case
     * toUpperCase()-- returns the calling string value converted to uppercase.
     * trim()--removes whitespace from both ends of a string.


     */
    public static void main(String[] args) {

//Difference between the usage of == operator and equals() method with Strings

        String s1 = "Java";
        String st1 = "Java";

        String s2 = new String("Java");
        String s3 = new String("Java");

        String s4 = "java";

        System.out.println(s1 == s2); //false , different memory location

        System.out.println(s1 == st1); //true, the same reference

        System.out.println(s1.equals(s2)); //true, different obj but same visible text

        System.out.println(s2.equals(s3)); //true, different obj but same visible text

        System.out.println(s1 == s4); //false, case sensitive

        System.out.println(s1.equals(s4)); //false

        System.out.println(s1.equalsIgnoreCase(s4)); //true, ignores case sensivetity


// Immutability of string

        String str = "Cydeo";

        str.concat(" School"); //

        System.out.println(str); // Cydeo

        str = str.concat(" School"); //

        System.out.println(str); // Cydeo School

    }


}