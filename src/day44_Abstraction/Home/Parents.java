package day44_Abstraction.Home;

public class Parents extends Person {

    public Parents(String name, int age, char gender) {
        super(name, age, gender);
    }

    //------------------------------------------------------------------





    //------------------------------------------------------------------


    public void eat(){
        if(getGender()=='M'){
            System.out.println(getName()+ " is eating from McDonalds.");
        }else {
            System.out.println(getName() + " is eating at home.");
        }
    }



    //------------------------------------------------------------------

}
