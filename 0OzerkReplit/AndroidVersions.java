package Ozerk;

import java.util.Scanner;

public class AndroidVersions {
    public static void main(String[] args) {
        //DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE:
        // Variables are already declared and given
        Scanner input = new Scanner(System.in);
        double version = input.nextDouble();

        //WRITE YOUR CODE HERE:
        Boolean Cupcake = version == 1.5;
        Boolean Donut = version == 1.6;
        Boolean Eclair = version == 2.1;
        Boolean Froyo = version == 2.2;
        Boolean Gingerbread = version == 2.3;
        Boolean Honeycomb = version == 3.1;
        Boolean Ice_Cream_Sandwich = version == 4.0;
        Boolean Jelly_Bean = version == 4.1;
        Boolean KitKat = version == 4.4;
        Boolean Lollipop = version == 5.0;
        Boolean Oreo = version == 8.0;
        Boolean Pie = version == 9.0;

        if(Cupcake){
            System.out.println("Cupcake");
        }else if(Donut){
            System.out.println("Donut");
        }else if(Eclair){
            System.out.println("Eclair");
        }else if(Froyo){
            System.out.println("Froyo");
        }else if(Gingerbread){
            System.out.println("Gingerbread");
        }else if(Honeycomb){
            System.out.println("Honeycomb");
        }else if(Ice_Cream_Sandwich){
            System.out.println("Ice Cream Sandwich");
        }else if(Jelly_Bean){
            System.out.println("Jelly Bean");
        }else if(KitKat){
            System.out.println("KitKat");
        }else if(Lollipop){
            System.out.println("Lollipop");
        }else if(Oreo){
            System.out.println("Oreo");
        }else if(Pie){
            System.out.println("Pie");
        }else{
            System.out.println("Sorry, I don't know this version!");
        }

    }
}
/*

Android is one of the best operating systems in the world that helps the billion of users who use smart phones and tablets.

Also, Android versions always had some funny names related to sweets.

In this assignment, you need to write a program that will print a name of Android version, based on number.

Please refer to the link beneath, in order to develop your if statement. https://www.javatpoint.com/android-versions

Create an object of Scanner class named scanner. (DONE)
Create double variable named version. (DONE)
Write an if statement that will print android version name based on value of the version variable.
Versions
1.5 - Cupcake 1.6 - Donut 2.1 - Eclair 2.2 - Froyo 2.3 - Gingerbread 3.1 - Honeycomb
4.0 - Ice Cream Sandwich 4.1 - Jelly Bean 4.4 - KitKat 5.0 - Lollipop 8.0 - Oreo 9.0 - Pie

Example:

input: 1.5
output: Cupcake

input: 1.5
output: Cupcake

input: 9.0
output: Pie
input: 9.0
output: Pie

input: 11.0
output: Sorry, I don't know this version!



*/