package Interface;

interface I {
    int a = 0;

    default void fun() {
        int b;
        b = 3;
        b = 1;
    }

}

public class FinalStaticVariables {
    public static void main(String[] args) {
        // I.a = 1; // Uncomment and analyze
    }
}
