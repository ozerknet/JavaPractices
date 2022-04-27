package day44_Abstraction.Students.MyAnimal;

public abstract class Animal {
    private String name;
    private int age;
    private final char gender;
    private final String color;

    //---------------------------------------------------------------------------------------------

    public Animal(String name, int age, char gender, String color) {
        setName(name);
        setAge(age);
        if ( !(gender == 'M' || gender =='F')){
            throw new RuntimeException("Invalid gender: "+gender);
        }
        this.gender = gender;
        this.color = color;
    }


    //---------------------------------------------------------------------------------------------


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public String getColor() {
        return color;
    }
    //---------------------------------------------------------------------------------------------


    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", color='" + color + '\'' +
                '}';
    }
}


/*
Animal
    Create an abstract class named Animal:
			Variables:
				name, gender(final),  age, color(final)

			Encapsulate all the fields

			Add a constructor that can set all the fields

			Methods:
				eat(); ==> different animals eat different foods
				drink() ==> all the animals drink water
				toString() ==> to display the full info of the animal



 */