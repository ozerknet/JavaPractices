package Ozerk;

import java.util.Scanner;

public class VideoGameCupons {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of coupons:");

        double coupons = input.nextInt();
        input.close();

        double Candies = (coupons / 10);
        double Gumballs = (coupons - (Candies * 10));


        if (coupons >= 3) {
            System.out.println("Number of Candies: " + Candies + "\nNumber of Gumballs: " + Gumballs);
        } else if (coupons < 3) {
            System.out.println("Not enough coupons");
        }
    }
}

/*

The video games machines at your local arcade outputs coupons according to how well you play the game.

You can redeem 10 coupons for a candy bar or you can redeem 3 for a gumball
Write a program that displays how many candy bars and gumballs you can get. You perfer candy bars.

if you the coupons are not enough for any redeem, display message:

"Not enough coupons"

Example:

Input:
Enter number of coupons:
13
​
Output: Number of Candies: 1
Output: Number of Gumballs: 1
Input:
Enter number of coupons:
13

Output: Number of Candies: 1
Output: Number of Gumballs: 1
Input:
Enter number of coupons:
23
​
Output: Number of Candies: 2
Output: Number of Gumballs: 1
Input:
Enter number of coupons:
23

Output: Number of Candies: 2
Output: Number of Gumballs: 1
Input:
Enter number of coupons:
2
​
Output: Not enough coupons




*/