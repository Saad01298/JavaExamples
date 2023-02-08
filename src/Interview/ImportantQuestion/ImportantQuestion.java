package Interview.ImportantQuestion;

interface A {
    default void fun () {
        System.out.println("Interface A");
    }

    default void fun3 () {
        System.out.println("Interface A");
    }

    void fun2 ();
}

interface B extends A {
    default void fun () {
        System.out.println("Interface B");
    }
}

class C {
    void fun () {
        System.out.println("Class C");
    }
}

class D extends C {
    void fun () {
        System.out.println("Class D");
    }
}

class E implements A {
    public void fun() {                 // if not public, then error
        System.out.println("Class E");
    }

    @Override
    public void fun2() {
        System.out.println("Class E fun 2");
    }
}


public class ImportantQuestion {
    public static void main(String[] args) {
        A a = new E();
        a.fun();
        a.fun2();
        a.fun3();

        A a1 = new A() {
            @Override
            public void fun2() {

            }
        };
        a.fun2();

        System.out.println("-----------------1-----------------");

        B b = new B() {
            @Override
            public void fun2() {
                System.out.println("Overrided in B");
            }
        };
        b.fun2();


        System.out.println("----------------2------------------");

        C c = new D();
        c.fun();

        System.out.println("----------------3------------------");

        A a2 = new E();
        a2.fun3();
        a2.fun();
        a2.fun2();


    }
}
