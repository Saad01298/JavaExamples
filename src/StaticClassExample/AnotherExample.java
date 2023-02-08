package StaticClassExample;

class Parent {
    static int y = 4;
}

class Child {
    static int y;
    static
    {
        y = 6;
    }
}

public class AnotherExample {
    public static void main(String[] args) {

        Child child = new Child();
        System.out.println(child.y);
    }
}
