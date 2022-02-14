package day10_Task;

public class Loans {
    public static void main(String[] args) {
        int salary = 120000;
        int creditScore = 650;

        String result   =  (salary>60000 && creditScore >650 )? "Loan Approved" : "Loan Denied" ;

        System.out.println("Loan application result = " + result);
    }
}
