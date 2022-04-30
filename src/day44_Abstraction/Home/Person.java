package day44_Abstraction.Home;

public class Person {
    private String name;
    private final int age;
    private char gender;

    //------------------------------------------------------------------

    public Person(String name, int age, char gender) {
        setName(name);
        setGender(gender);
        this.age = age;
    }

    //------------------------------------------------------------------


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    //------------------------------------------------------------------

    public void eat() {
    }

    public void sleep() {
    }

    public void add(){}

    //------------------------------------------------------------------

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}

/*

Home Task:
		Create an abstract class named Person:
			Variables:
				name, gender(final),  age,

			Encapsulate all the fields

			Add a constructor that can set all the fields

			Methods:
				eat(); ==> different persons eat different foods
				sleep() ==> all the person sleep

				toString() ==> to display the full info of the person

 */