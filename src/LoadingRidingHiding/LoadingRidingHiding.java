package LoadingRidingHiding;

class A {
    int method1 (int a, char b) {       // Overloading
        System.out.println("A Int + Char");
        return 0;
    }

    int method1 (int a) {
        System.out.println("A Int");
        return 0;
    }

    /*boolean method1 (int a) {         it will be an error     !Important!
        return true;
    }*/

    int method1 (char a) {
        System.out.println("A Char");
        return 0;
    }

    int method1 (float a) {
        System.out.println("A Float");
        return 0;
    }

    //static void method1 (int a) {}      it will be an error

    static void method2 (int a) {
        System.out.println("static A");
    }

    void method3 () {
        System.out.println("A Method 3");
    }
}

class B extends A {
    void method3 () {                                               // Overriding
        System.out.println("B Method 3");
    }

    static void method2 (int a) {
        System.out.println("static B");
    }  // Overhiding

    @Override
    int method1(int a) {           // Overriding
        System.out.println("B Int");
        return super.method1(a);   // Accessing using Super
    }



    //static int method1 (float a) {} it will give error

}

public class LoadingRidingHiding {
    public static void main(String[] args) {
        A a = new A();
        a.method1(1);
        a.method1('1');
        a.method1((float) 1.1);
        A.method2(2);

        System.out.println("Checking B");
        B b = new B();
        b.method1(2);
        b.method1(1, '1');
        B.method2(1);

        System.out.println("Checking A - B");
        A a1 = new B();
        a1.method1(1);
        A.method2(2);

        System.out.println("---------------------------");

        A a2 = new A();
        B b2 = new B();

        a2.method3();
        b2.method3();
        A.method2(3);
        B.method2(3);

    }
}
