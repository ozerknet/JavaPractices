package day07_Operators.day14_String;

public class ZPrac {
    public static void main(String[] args) {
        String s = "Let is do something with JAVA                 ";
        System.out.println("s = " + s);
        String s1 = s.trim();

        System.out.println("s1 = " + s1);

        // String s2= s.lastIndexOf();


        String str = "Cydeo School"; 
        String brand = str.substring(0,5); // ending index not taking. so 5 take
         System.out.println("brand = " + brand);

        System.out.println("*****************************************************");

        String sen = "Java Programming Language";
        String s5 = sen.substring(0, sen.indexOf(" "));
        String s6 = sen.substring(sen.indexOf(" ")+1, sen.lastIndexOf(" "));
        String s7 = sen.substring(sen.lastIndexOf(" ") +1 );
        System.out.println("s1 = " + s5);
        System.out.println("s6 = " + s6);
        System.out.println("s7 = " + s7);
        
        
    }
}


/*

charAt() --> giving number of chart in the String
length() --> giving length of the String
toLowerCase() --> it makes String's charters to lover case
toUpperCase() --> it makes String's charters to upper case
trim() ---> trim of the end of the String
indexOf() --> it gives charcter index number
lastIndexOf() --> it gives lastindex
replace() --> it change with new valuu with other one.
replaceFirst() -->
Substring() --> 
repeat() 
isEmpty()
isBlank() 
equals () 
equalsIgnoreCase()


String Methods:
	charAt(index): returns the character at the given index, returns char
					String s = "Python"
					s.charAt(3) ==> 'h'


	length(): returns the total number of characters, returns int

			last index: length() -1


	toLowerCase(): returns new String in the lower case version of old string object

	toUpperCase(): returns new String in the upper case version of old string object

	trim(): returns new String without the white spaces (unused spaces)

	indexOf(str): returns the index number of first occurred character. returns int

	lastIndexOf(str): returns the index number of last occurred character. returns int

	replace(oldValue, newValue): returns new string by repalcing All the old values with the given new value.

	replaceFirst(oldValue, newValue): returns new string by repalcing  the FIRST matchingold values with the given new value.

	substring(beginningIndex , endingIndex): creates substring starting from the given beginning index till the given edning index (ending index is excluded)

					String str ="Cydeo School";
				   str.substring(0,  4+1) ==> Cydeo


	substring(beginningIndex): creates substring starting from the given beginning index till the end of the string

					String str = "Cydeo School";
						  str.substring(6) ==> School

	repeat(count): repeats the string for given number of times. returns string


	equals(): checks if two strings have same text, returns boolean


*/