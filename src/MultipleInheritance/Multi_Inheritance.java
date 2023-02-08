package MultipleInheritance;

interface C {
    default int show(int a){
        System.out.println("C + " + a);
        return 2;
    }
}

interface B {
    default int show(int a){
        System.out.println("B + " + a);
        return 2;
    }
}

interface D {
    int show (int a);
}

interface root1 {
    default void IamRoot () {
        System.out.println("I am from Root 1");
    }
}

interface root2 {
    default void IamRoot () {
        System.out.println("I am from Root 2");
    }
}

interface child1 extends root1 {
}

interface child2 extends root2 {
}


class letsCheck implements root1, root2 {

    @Override
    public void IamRoot() {
        root1.super.IamRoot();
        root2.super.IamRoot();
    }
}

class letsCheckAgain implements child1, child2 {

    @Override
    public void IamRoot() {
        child1.super.IamRoot();
        child2.super.IamRoot();
    }
}



public class Multi_Inheritance implements B, C {
    @Override
    public int show(int a) {
        System.out.println("First + " + a);

        int x = B.super.show(a);
        int y = C.super.show(a);
        return 7 - x + y;
    }

    public static void main(String[] args) {
        B b = new Multi_Inheritance();
        System.out.println(b.show(8));
    }


}

// If one interface has show() as default method and other as abstract method then also we need to define
class A implements C,D {

    @Override
    public int show(int a) {
        return C.super.show(a);
    }
}

// If interface has default method, then overriding not necessary
class E implements C {

}



interface First {
    public void show ();
}


interface Second {
    public void show ();
}


class third implements First, Second {

    @Override
    public void show() {

    }
}

