package day44_Abstraction.School;

public interface Teach {


    public default void teach(){
        System.out.println("Who is teaching?");
    }
}
