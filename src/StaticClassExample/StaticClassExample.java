package StaticClassExample;

interface abs {

}

class asd {

}

class A {
    public int a;
    A() {
        a=3;
    }

    //A.B.C c = new B.C();  // if C is not static, then this is error

    static class B extends asd implements abs {
        A obj = new A();
        //obj.a =  4;     error

        int s = 5;
        static int p = 4;

        class C {
            int c = 5;
            protected int g = 6;

            public int getC() {
                return c;
            }
        }

        C obj1 = new C();
        // obj1.getC();     // error
    }
}

public class StaticClassExample {
    public static void main(String[] args) {
        A.B b = new A.B();
        b.s = 5;
        b.obj1.c = 5;
        b.obj1.g = 2;    // Can't access private
        b.obj.a = 3;

        int p = A.B.p;

    }
}
