package day44_Abstraction.School;

public abstract class Person {
    private String title;
    private final char gender;
    private String name;
    private int age;

    public Person(String title, char gender, String name, int age) {
        setTitle(title);
        this.gender = gender;
        setName(name);
        setAge(age);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public char getGender() {
        return gender;
    }

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


    @Override
    public String toString() {
        return "Person{" +
                "title='" + title + '\'' +
                ", gender=" + gender +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
