package Ozerk;

public class CaffeineOverDose {
    public static void main(String[] args) {

        int drink = 500; // 5miligrams in on drink
        //10 gr is kill and 1000miligram to 1 gr

        int numOfMilligrams = (10*1000) / drink ;

        System.out.println( "Enter number of milligrams in drink:\nIt would take about " + numOfMilligrams + " drinks for a lethal overdose.");

    }
}


/*
Scientists estimate that roughly 10 grams of caffeine consumed at one time is a lethal overdose.

Write a program with a variable that holds the number of mgs of caffeine in a drink and outputs how many drinks it takes to kill a person.

In one gram, there is 1000 mg. Formula to get drink count to cause an overdose is

Flow: Enter number of milligrams in drink: It would take about # drinks for a lethal overdose.

10*1000 / numOfMilligrams


* */