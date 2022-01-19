package day04_Variables;

public class ZSchool {
    public static void main(String[] args) {
        int engTotalHourPerWeek = 2;
        int engPerHour = 14;
        int engPerWeekPrice = engTotalHourPerWeek * engPerHour;
        int engPerTerm = 6;
        int engPricePerTerm = engPerTerm * engPerWeekPrice;
        System.out.println("English Lesson Price : " + engPricePerTerm);

        int matTotalHourPerWeek = 2;
        int matPerHour = 15;
        int matPerWeekPrice = matTotalHourPerWeek * matPerHour;
        int matPerTerm = 6;
        int matPricePerTerm = matPerTerm * matPerWeekPrice;
        System.out.println("Mathmatic Lesson Price : " + matPricePerTerm);

    }
}
