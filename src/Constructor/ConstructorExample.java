package Constructor;

class C {
    C() { // Write void before C() and see result
        System.out.println("Constructor");
    }

    void C() {

    }

    void C(int a) {

    }

    // int C () {} // Uncomment and it will give error
}

public class ConstructorExample {
    public static void main(String[] args) {
        C c = new C();
    }
}
