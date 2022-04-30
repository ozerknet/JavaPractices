package day44_Abstraction.Home;

public class Children extends Person {
    public Children(String name, int age, char gender) {
        super(name, age, gender);
    }

    public void eat(){
        if(getAge()<3){
            System.out.println(getName() + " is eating milk");
        }else {
            System.out.println(getName() + " is eating soup");
        }
    }


}
