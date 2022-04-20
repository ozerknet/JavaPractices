import java.util.Scanner;

public class PracReplied1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String item = scan.nextLine();
        scan.close();

        /*-----------------------------------*/

        int price = 100;

        int Blanket = 60;
        boolean res1 = item.equalsIgnoreCase("blanket");
        int Charger = 25;
        boolean res2 = item.equalsIgnoreCase("Charger");
        int Hat = 25;
        boolean res3 = item.equalsIgnoreCase("Hat");
        int Headphones = 30;
        boolean res4 = item.equalsIgnoreCase("Headphones");
        int Laptop = 200; //
        boolean res5 = item.equalsIgnoreCase("Laptop");
        int Pants = 50;
        boolean res6 = item.equalsIgnoreCase("Pants");
        int Pillow = 40;
        boolean res7 = item.equalsIgnoreCase("Pillow");
        int Smartphone = 1000; //
        boolean res8 = item.equalsIgnoreCase("Smartphone");
        int Socks = 5;
        boolean res9 = item.equalsIgnoreCase("Socks");
        int USB_cable = 10;
        boolean res10 = item.equalsIgnoreCase("USBcable");

        int balance;

        boolean itemPriceLess = price < 100;

        if (res1) {
            System.out.println("Thank you for your purchase!");
            balance = price - Blanket;
            System.out.println("Your current balance is: " + balance + "$");

        } else if (res2) {
            System.out.println("Thank you for your purchase!");
            balance = price - Charger;
            System.out.println("Your current balance is: " + balance + "$");

        } else if (res3) {
            System.out.println("Thank you for your purchase!");
            balance = price - Hat;
            System.out.println("Your current balance is: " + balance + "$");

        } else if (res4) {
            System.out.println("Thank you for your purchase!");
            balance = price - Headphones;
            System.out.println("Your current balance is: " + balance + "$");

        } else if (res5) {
            System.out.println("Sorry, not enough funds on your gift card!");

        } else if (res6) {
            System.out.println("Thank you for your purchase!");
            balance = price - Pants;
            System.out.println("Your current balance is: " + balance + "$");

        } else if (res7) {
            System.out.println("Thank you for your purchase!");
            balance = price - Pillow;
            System.out.println("Your current balance is: " + balance + "$");

        } else if (res8) {
            System.out.println("Sorry, not enough funds on your gift card!");

        } else if (res9) {
            System.out.println("Thank you for your purchase!");
            balance = price - Socks;
            System.out.println("Your current balance is: " + balance + "$");

        } else if (res10) {
            System.out.println("Thank you for your purchase!");
            balance = price - USB_cable;
            System.out.println("Your current balance is: " + balance + "$");

        } else {
            System.out.println("Invalid item!");
        }


    }
}

/*

Similar to Vending Machine
Let's say I've got a 100$ gift card and you want to buy something in your online store .
Write a program that will help me to buy something and display leftover balance after purchase.

If item is not in the list, display message: "Invalid item!".
If price is more than 100$, display message: "Sorry, not enough funds on your gift card!".
List of items Blanket - 60$ Charger - 25$ Hat - 25$ Headphones - 30$ Laptop - 200$ Pants - 50$ Pillow - 40$ Smartphone - 1000$ Socks - 5$ USB cable - 10$

Hint: if/ else if / else or switch statement

Examples:

input: Hat
output:
Thank you for your purchase!
Your current balance is: 75$

input: Hat
output:
Thank you for your purchase!
Your current balance is: 75$

input: Pants
output:
Thank you for your purchase!
Your current balance is: 50$

input: Pants
output:
Thank you for your purchase!
Your current balance is: 50$

input: Laptop
Output:
Sorry, not enough funds on your gift card!

input: Laptop
Output:
Sorry, not enough funds on your gift card!

input: Cupcake
output: Invalid item!





*/
