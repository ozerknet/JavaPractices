import java.util.Scanner;

public class ParentInformation {
    public static void main(String[] args) {
        //Enter your code here
        String firstName;
        String lastName;
        String fullName;
        String email;
        String street;
        String state;
        String city;
        String address;
        String contacts;

        int age, zipcode;
        double height, weight = 0;
        boolean isMarried;
        long workPhoneNumber, personalPhoneNumber;
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the patient portal!");
        System.out.println("Please enter your personal information");
        System.out.println("Enter your first name");
        firstName = scan.next();
        System.out.println("Enter your last name");
        lastName = scan.next();

        // this part is already provided DO NOT CHANGE

        System.out.println("Enter your email");
        email = scan.next();

        scan.nextLine();//to capture Enter key press

        System.out.println("Enter your street");
        street = scan.nextLine();
        // continue for

        System.out.println("Enter your city");
        city = scan.nextLine();

        System.out.println("Enter your state");
        state = scan.nextLine();

        System.out.println("Enter your zip code");
        zipcode = Integer.parseInt(scan.nextLine());

        System.out.println("Enter your work phone number");
        workPhoneNumber = Long.parseLong(scan.nextLine());

        System.out.println("Enter your personal phone number");
        personalPhoneNumber = Long.parseLong(scan.nextLine());

        System.out.println("Enter your age");
        age = Integer.parseInt(scan.nextLine());


        System.out.println("Enter your height");
        height = Double.parseDouble(scan.nextLine());

        System.out.println("Enter your weight");
        height = Double.parseDouble(scan.nextLine());

        System.out.println("Are you married?");
        isMarried = Boolean.parseBoolean(scan.nextLine());

        contacts = "work phone number - " + workPhoneNumber+ ", personal phone number - " + personalPhoneNumber + ", email: " + email;
        fullName = lastName+","+" "+firstName ;
        address = street+"," +" "+city+"," +" "+state +" "+ zipcode;


        System.out.println("Patient personal information");
        System.out.println("Full name: " + fullName);
        System.out.println("Address: " + address);
        System.out.println("Contacts: " + contacts);
        System.out.println("Age: "+ age);
        System.out.println("Height:" + height);
        System.out.println("Weight:" + weight);
        System.out.println("Married?: " + isMarried);

        /*
        build contacts variable by concatenating work phone, personal phone and email

        build fullName variable by concatenating first name and last name

        build address variable by concatenating street, city, state, zip code

        Output in the console:
        */

    }
}





/*

Declare 9 String variables firstName, lastName, fullName, email, street, state, city, address, contacts.

Declare 2 int variables: age, zipcode Declare 2 double variables: height, weight. Declare boolean variable: isMarried (for marriage status). Declare 2 long variables: workPhoneNumber and personalPhoneNumber.

Create a Scanner object named scan.

Execution flow with example:

Welcome to the patient portal!
Please enter your personal information
Enter your first name
James
Enter your last name
May
Enter your email
jamesmay@gmail.com
Enter your street
7925 Jones Branch Dr
Enter your city
McLean
Enter your state
VA
Enter your zip code
22102
Enter your work phone number
7896542314
Enter your personal phone number
2406542314
Enter your age
35
Enter your height
5.10
Enter your weight
173.2
Are you married?
true
Welcome to the patient portal!
Please enter your personal information
Enter your first name
James
Enter your last name
May
Enter your email
jamesmay@gmail.com
Enter your street
7925 Jones Branch Dr
Enter your city
McLean
Enter your state
VA
Enter your zip code
22102
Enter your work phone number
7896542314
Enter your personal phone number
2406542314
Enter your age
35
Enter your height
5.10
Enter your weight
173.2
Are you married?
true
build contacts variable by concatenating work phone, personal phone and email

build fullName variable by concatenating first name and last name

build address variable by concatenating street, city, state, zip code

Output in the console:

Patient personal information Full name: May, James Address: 7925 Jones Branch Dr, McLean, VA 22102 Contacts: work phone number - 7896542314, personal phone number - 2406542314, email: jamesmay@gmail.com Age: 35 Height: 5.1 Weight: 173.2 pounds Married?: true



*/