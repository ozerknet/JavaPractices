package PolipostTask;

import day29_ArrayList.scrumTask.Tester;

import java.util.ArrayList;

public class Centre {
    public static void main(String[] args) {
        Vendor ven1 = new Vendor("Vendor","Ali",'M',25,"2 years");
        Vendor ven2 = new Vendor("Vendor","Mehmet",'M',35,"1 years");

        Customer cus1 = new Customer("Customer","Ozer",'M',25,"Bham",415);
        Customer cus2 = new Customer("Customer","Omer",'M',14,"London",415);

        Partner par1 = new Partner("Partner","Veli",'M',12,"Polipost",1400);
        Partner par2 = new Partner("Partner","Dilek",'F',22,"Polipost",1200);



        ArrayList<Customer> customers = new ArrayList<>();
        ArrayList<Partner> partners = new ArrayList<>();
        ArrayList<Vendor> vendors = new ArrayList<>();

        customers.add(cus1);
        customers.add(cus2);

        partners.add(par1);
        partners.add(par2);

        vendors.add(ven1);
        vendors.add(ven2);

        System.out.println("Vendors = " + vendors + "\n" + "Customers = " + customers + "\n" + "Partners = " + partners);

        ven1.sell();
        cus2.buy();
        par1.profit();

    }


}
