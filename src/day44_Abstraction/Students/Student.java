package day44_Abstraction.Students;

public abstract class Student {
    private int ID;
    private String name;
    private final char gender;
    private int age;
    private int yearClass;

    public final static boolean canSleep;

    static{
        canSleep = true;
    }
//---------------------------------------------------------------------------------------------


    public Student(int ID, String name, char gender, int age, int yearClass) {
        setID(ID);
        setName(name);
        if (!(gender == 'M' || gender == 'F')) {
            throw new RuntimeException("Invalid gender: " + gender);
        }
        this.gender = gender;
        setAge(age);

        setYearClass(yearClass);

    }

    //---------------------------------------------------------------------------------------------
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty()) {
            throw new RuntimeException("Invalid Name");
        }
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age <= 0){
            throw new RuntimeException("Invalid age: "+age);
        }
        this.age = age;

    }

    public int getYearClass() {
        return yearClass;
    }

    public void setYearClass(int yearClass) {
        this.yearClass = yearClass;
    }
    //---------------------------------------------------------------------------------------------

    public abstract void exam();

    public abstract void eat();

    public abstract void drive();


    //---------------------------------------------------------------------------------------------


    @Override
    public String toString() {
        return "Student{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", yearClass=" + yearClass +
                '}';
    }
}
