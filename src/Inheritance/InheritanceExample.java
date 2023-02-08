package Inheritance;

class AB {
    int x = 1;
    static int y = 10;

    public void fun() {
        System.out.println("AB");
    }
}

class CD extends AB {
    int x = 2;
    static int y = 20;

    public void fun() {
        System.out.println("CD");
    }
}

interface EF {
    int x = 3;
    static int y = 30;

    default public void fun() {
        System.out.println("EF");
    }
}

class GH implements EF {
    int x = 4;
    static int y = 40;

    public void fun() {
        System.out.println("GH");
    }
}

class IJ extends GH implements EF {
    int x = 5;
    static int y = 50;

    public void fun() {
        System.out.println("IJ");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        AB ab1 = new AB();
        System.out.println("x = " + ab1.x + "; static y = "+AB.y);
        ab1.fun();

        AB ab2 = new CD();
        System.out.println("x = " + ab2.x + "; static y = "+AB.y);
        ab2.fun();



        CD cd1 = new CD();
        System.out.println("x = " + cd1.x + "; static y = "+CD.y);
        cd1.fun();
        //CD cd3 = new AB(); // this will give error



        
    }
}
