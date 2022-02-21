package week06;

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Split or No split (Yes or No): ");
        String split = scan.next();
        System.out.println("Number of people entered: ");
        int person = scan.nextInt();
        System.out.println("Check amount: ");
        double amount = scan.nextDouble();
        System.out.println("Service Quality:");
        String serviceQuality = scan.next();
        double tipPoor = 0.05 * amount;
        double tipFair = 0.10 * amount;
        double tipGood = 0.15 * amount;
        double tipGreat = 0.2 * amount;
        double tipExcellent = 0.25 * amount;

        if (serviceQuality.equals("Poor")) {
            System.out.println("Total to pay: " + amount + tipPoor);
            double totalToPay = scan.nextDouble();
            System.out.println("Total tip: " + tipPoor);
            System.out.println("Total per person: " + (amount + tipPoor) / person);
            double totalPerPerson = scan.nextDouble();
            System.out.println("Tip per person: " + tipPoor / person);
            double tipPerPerson = scan.nextDouble();
        } else if (serviceQuality.equals("Fair")) {
            System.out.println("Total to pay: " + amount + tipFair);
            double totalToPay = scan.nextDouble();
            System.out.println("Total tip: " + tipFair);
            System.out.println("Total per person: " + (amount + tipFair) / person);
            double totalPerPerson = scan.nextDouble();
            System.out.println("Tip per person: " + tipFair / person);
            double tipPerPerson1 = scan.nextDouble();
        } else if (serviceQuality.equals("Good")) {
            System.out.println("Total to pay: " + amount + tipGood);
            double totalToPay = scan.nextDouble();
            System.out.println("Total tip: " + tipGood);
            System.out.println("Total per person: " + (amount + tipGood) / person);
            double totalPerPerson = scan.nextDouble();
            System.out.println("Tip per person: " + tipGood / person);
            double tipPerPerson2 = scan.nextDouble();
        } else if (serviceQuality.equals("Great")) {
            System.out.println("Total to pay: " + amount + tipGreat);
            double totalToPay = scan.nextDouble();
            System.out.println("Total tip: " + tipGreat);
            System.out.println("Total per person: " + (amount + tipGreat) / person);
            double totalPerPerson = scan.nextDouble();
            System.out.println("Tip per person: " + tipGreat / person);
            double tipPerPerson3 = scan.nextDouble();
        } else if (serviceQuality.equals("Excellent")) {
            System.out.println("Total to pay: " + amount + tipExcellent);
            double totalToPay = scan.nextDouble();
            System.out.println("Total tip: " + tipExcellent);
            System.out.println("Total per person: " + (amount + tipExcellent) / person);
            double totalPerPerson = scan.nextDouble();
            System.out.println("Tip per person: " + tipExcellent / person);
            double tipPerPerson4 = scan.nextDouble();
        } else {
            System.out.println(" ");
        }


    }


}


