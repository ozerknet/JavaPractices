package day44_Abstraction.School;

public interface Learn {
    public default void learn(){
        System.out.println("Who is learning ?");
    }
}
