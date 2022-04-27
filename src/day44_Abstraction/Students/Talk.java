package day44_Abstraction.Students;

public interface Talk {
    public default void talk(){
        System.out.println("Easy talking");
    }
}
