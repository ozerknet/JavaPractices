package day02_PrintStatements.day10_Task;

public class CrewAndPassangers {
    public static void main(String[] args) {
        int people = 175;

        if (people >= 1 && people <= 100) { // if passenger number is valid

            if (people == 50) { // if passenger number is 50
                System.out.println("20 crew, 30 passangers");
            } else if (people == 75) { // if passenger number is 75
                System.out.println("25 crew, 50 passangers");
            } else if (people == 100) { // if passenger number is 100
                System.out.println("30 crew, 70 passangers");
            }

        } else { //if

            System.out.println("ship is not valid ");

        }
    }
}

