package day46_Polymorphism.Structure;

public abstract class Person {
    private String name;
    private int age;
    private final char gender;

    //---------------------------------------------------------------------------------------------


    public Person(String name, int age, char gender) {
        setName(name);
        setAge(age);
        if (!(gender == 'M' || gender == 'F')) {
            throw new RuntimeException("Invalid gender: " + gender);
        }
        this.gender = gender;
    }

    //---------------------------------------------------------------------------------------------

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == "") {
            System.err.println("Name can not null");
            ;
        }
        this.name = name;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new RuntimeException("Invalid age: " + age);
        } else {
            this.age = age;
        }

    }

    public char getGender() {
        return gender;
    }


    //---------------------------------------------------------------------------------------------

    public abstract void eat();

    public abstract void work();


    // public abstract void Drink();

    //---------------------------------------------------------------------------------------------


    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}


