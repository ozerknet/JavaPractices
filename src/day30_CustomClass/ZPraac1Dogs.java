package day30_CustomClass;

public class ZPraac1Dogs {

    public String name;
    public Integer age;
    public char gender;
    public String breed;
    public String size;
    public String color;

    public void setInfo(String dogName, String dogBreed, int dogAge, char dogGender, String dogSize, String dogColor ) {
        name = dogName;
        breed = dogBreed;
        age = dogAge;
        gender = dogGender;
        size = dogSize;
        color = dogColor;
    }


    public void eat(){
        System.out.println(name + " is eating.");
    }

    public void bark(){
        System.out.println(name + " is barking.");
    }


}

/*
Attributes :
name,age,gender,breed,size,color

Actions:
eat(), play(), sit(), sleep(), run(), bark()
 */