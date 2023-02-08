package Encapsulation;

class Encapsulation {
    private int x;

    public Encapsulation(int x) {
        this.x = x;
    }

    public int getV() {
        return getVP();
    }

    private int getVP() {
        return x;
    }
}

// In encapsulation, the data in a class is hidden from other classes using the data hiding
// concept which is achieved by making the members or methods of a class private, and the class
// is exposed to the end-user or the world without providing any details behind implementation
// using the abstraction concept, so it is also known as a combination of data-hiding and abstraction

// Encapsulation can be achieved by Declaring all the variables in the class as private and writing
// public methods in the class to set and get the values of variables

public class EncapsulationExample {
    public static void main(String[] args) {
        Encapsulation encapsulation = new Encapsulation(32);
        int c = encapsulation.getV();
        System.out.println(c);
    }
}


class A {
   private int a, b;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}

class B {
    private int a,b;
    public B(int a, int b) {
        this.a = a;
        this.b = b;
    }
}

class C {
    private A aClass;
    public C (int a, int b) {
        aClass = new A();
        aClass.setA(a);
        aClass.setB(b);
    }
}

