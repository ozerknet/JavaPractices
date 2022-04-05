package day36_Inheritance.humanTask;

public class Human {

    public String name;
    public char gender;
    public double size;
    public int age;
    public String color;

    public void setInfo(String name, char gender, double size, int age, String color) {
        this.name = name;
        this.gender = gender;
        this.size = size;
        this.age = age;
        this.color = color;
    }

    public void eat(){
        System.out.println(name + " is eating.");
    }
    public void drink(){
        System.out.println(name + " is drinking.");
    }
    public void sleep(){
        System.out.println(name + " is sleeping.");
    }



    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", size=" + size +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}

/*
Task :

    Human :
            name,gender,size,age,color
            setInfo(), eat(), drink(), sleep()

            toString()

    Turkish extends Human:
            turkisTalk()
    British extends Human:
            englishTalk()
    Arabic extends Human:
            arabicTalk()



 */
