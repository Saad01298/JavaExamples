package Interface;

interface P1 {
    default void show(){
        System.out.println("P1");
    }

    static void staticShow(){
        System.out.println("P1");
    }
}

interface P2 {
    default void show(){
        System.out.println("P2");
    }

    static void staticShow(){
        System.out.println("P2");
    }
}

class P3 {
    void show() {
        System.out.println("P3");
    }
}

// Static not being overrided
// Even if we remove commnts, then also program will work
public class DiamondProblemExample extends P3 implements P1, P2 {
    public static void main(String[] args) {
        DiamondProblemExample d = new DiamondProblemExample();
        d.show();
    }

    // Comment this function and see diamond problem and thirds rule in action!
    @Override
    public void show() {
        P1.super.show(); // Not compulsory
        P2.super.show(); // Not compulsory
    }
}
