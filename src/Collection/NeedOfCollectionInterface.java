package Collection;

import java.util.Objects;

public class NeedOfCollectionInterface {
    public static void main(String[] args) {
        int [] arr = new int[5];

        // Limitations of Array && Reasons why Collection Interface was introduced
        // 1. Fixed size
        // 2. Can hold homogeneous data only
        // 3. Ready-made API support not available

        A [] a = new A[3];
        a[0] = new A();
        a[1] = new A();
        // a[2] = new B(); it will give error

        // Solution
        Object [] objects = new Object[3];
        objects [0] = new A();
        objects [1] = new B();
    }
}

class A {}
class B {}
