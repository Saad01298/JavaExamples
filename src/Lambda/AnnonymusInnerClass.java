package Lambda;

interface  A {
    void show();
}

/*class xyz implements A {

    @Override
    public void show(int i) {
        System.out.println("Hello" + i);
    }
}*/

public class AnnonymusInnerClass {
    public static void main(String[] args) {
        A obj = new A(){
            public void show(){
                System.out.println("Hello");
            }
        };


        // We can write above code like this as well
        A obj1 = () -> {
            System.out.println("Hello 1");
        };

        obj1.show();

        // and because we have only one line of code

        A obj2 = () -> System.out.println("Hello 2");

        // If we implement in form of lambda, then we will not have a separate file of inner class

        obj2.show();
    }
}
