package day35_Encapsulation.encapsulation;

import day30_CustomClass.Car;
import day30_CustomClass.Dog;

import java.util.ArrayList;
import java.util.Arrays;

public class ZStaffObjects {
    public static void main(String[] args) {

        ZStaff s1 = new ZStaff("Ozer",'M',50,7400);
        ZStaff s2 = new ZStaff("Ahmet",'M',35,17400);
        ZStaff s3 = new ZStaff("Leyla",'F',45,74400);
        ZStaff s4 = new ZStaff("Elif",'F',25,50400);
        ZStaff s5 = new ZStaff("Duygu",'F',55,40400);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);

        ZStaff[] staffs = {s1, s2, s3, s4, s5};
        System.out.println("Arrays.toString(staffs = " + Arrays.toString(staffs));


    }
}
