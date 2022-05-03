package day44_Abstraction.School;

public interface Cook {

    default void Cook(){
        System.out.println("Who is cooking?");
    }
}
