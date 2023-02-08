package Polymorphism;


// Compile-time polymorphism also known as static polymorphism.
// This type of polymorphism is achieved by function overloading or operator overloading.
// Java doesn’t support the Operator Overloading.


class AnExample {
    public void Method (int a) {
       System.out.println("Int");
    }

    public void Method (String a) {
        System.out.println("String");
    }

    public void Method (float a) {
        System.out.println("Float");
    }
}

class two extends AnExample {
    public void Method (int a) {
        System.out.println("Two Int");
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {

        // Good Example
        AnExample anExample = new AnExample();
        anExample.Method(4.0F);

        AnExample anExample1 = new two();
        anExample1.Method(34);
    }

    public void IamMethod() {}
    public void IamMethod (int a) {}
}
