package day24_CustomMethods_Return;

import java.sql.SQLOutput;

public class ZPrac1 {
    public static void main(String[] args) {
        initials("ozer", "kutuk");

        stringindexfind("Adam ? durmadan agliyor! ve bakiyordu! ama konusmuyordu!");

        String[] emails = {"josh@gmail.com", "jim@hotmail.com", "aglja@aol.com", "gulsej@gmail.com"};

        //domain ( emails[0] )

        for (String email : emails) {
            domainEmail(email);
        }

whichMonth(10);




    }

    public static void initials(String firstName, String lastName) {
        String initial = firstName.charAt(0) + "." + lastName.charAt(0) + ".";
        initial = initial.toUpperCase();
        System.out.println("initial = " + initial);
    }

    public static void domainEmail(String email) {

        String domain = email.substring(email.indexOf("@") + 1, email.lastIndexOf("."));
        System.out.println("domain = " + domain);
    }

    public static void stringindexfind(String sentences) {
        String here = sentences.substring(sentences.indexOf("?"), sentences.lastIndexOf("!"));
        System.out.println("That is here = " + here);
    }
    public static void whichMonth(int num ) {
        String[] months = {"","Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        if(num==1){
            System.out.println(months[1]);
        }else if(num==2){
            System.out.println(months[2]);
        }else if(num==3){
            System.out.println(months[3]);
        }else if(num==4){
            System.out.println(months[4]);
        }else if(num==5){
            System.out.println(months[5]);
        }else if(num==6){
            System.out.println(months[6]);
        }else if(num==7){
            System.out.println(months[7]);
        }else if(num==8){
            System.out.println(months[8]);
        }else if(num==9){
            System.out.println(months[9]);
        }else if(num==10){
            System.out.println(months[10]);
        }else if(num==11){
            System.out.println(months[11]);
        }else if(num==12){
            System.out.println(months[12]);
        }else {
            System.out.println("Invalid number");
        }

    }

}
