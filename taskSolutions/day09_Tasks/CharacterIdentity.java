package day09_Tasks;

public class CharacterIdentity {
    public static void main(String[] args) {
        char ch = 'b' ;

        if ((ch>64 && ch<94) || (ch>96&&ch<123)){
            System.out.println("Alphabetic Character");
        }
        else if (ch>30 && ch<39){
            System.out.println("Digit character");
        }

        else {
            System.out.println("Special character");
        }



    }
}

/*

4. Create a class called Character Identity, and write a program that can identify if the given character is a digit or Alphabetic Character(A~Z or a~Z) or a special character

		Ex:
			ch = '@'

		output:
			Special Character

		HINT: You may wanna check out the numbers of the chracters on ASCII table




*/