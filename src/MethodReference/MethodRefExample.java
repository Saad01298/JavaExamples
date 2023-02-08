package MethodReference;

interface A {
    public int FI (int a);
    public default int FY (int a){
        return 9;
    }
    static void ABC () {
    }
}
interface B {
    public void FIB ();
}
public class MethodRefExample {
    public static void main(String[] args) {
        A a = MethodRefExample :: IamMethod;
        int c = a.FI(7);
        System.out.println(c + " I have been Returned");

        B b = new MethodRefExample() :: IamAlsoMethod;
        b.FIB();
    }
    private static int IamMethod (int a) {
        System.out.println("I am being Referenced! " + a);
        return 9;
    }
    public void IamAlsoMethod () {
        System.out.println("I have been called by object!");
    }
}
