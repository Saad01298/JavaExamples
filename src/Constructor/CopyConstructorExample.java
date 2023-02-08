package Constructor;

class A {
    int a;
    A(){}

    A(int a) {
        this.a = a;
    }
}

class B {
    int b;
}

public class CopyConstructorExample {
    public static void main(String[] args) {
        A a = new A(5);
        A b = new A();

        b = a;

        System.out.println(a);
        System.out.println(b);

        System.out.println(b.a);
    }
}
