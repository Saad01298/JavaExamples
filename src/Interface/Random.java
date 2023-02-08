package Interface;

interface A {
    //int fun();
    default int fun2() {
        return 1;
    }
}

class B {
    int a;
    int fun() {
        return 2;
    }
}

public class Random {
    public static void main(String[] args) {
        //A a = new A() ;    // Remove this comment and see result

        B b = new B();

        A a1 = new A() {
            @Override
            public int fun2() {
                return 0;
            }
        };
    }
}
