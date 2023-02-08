package Interface;

// ????????????????????????????????? without default
interface letsCheck1 {
    int b = 0; // By default: final - static - public

    private int show1(int a) {
        return a;
    }
}

interface letsCheck2 {
    default int show2 (int a) {
        return a + 2;
    }
}


interface Phone{
    void call(int h);
    default void message(){
        System.out.println("Messaging");
    }
    static void IamStatic () {
        System.out.println("Static Method");
    }
}

class AndroidPhone implements Phone{

    @Override
    public void call(int h) {
        System.out.println(h + " Hello how R");
    }

    public void message(){
        System.out.println("Messaging from Android");
    }
}

public class DemoInterface {
    public static void main(String[] args) {
        Phone P = new AndroidPhone();
        P.call(7);
        P.message();

        Phone.IamStatic();

        Phone phone = (k) -> System.out.println("Hello" + k);
        phone.call(4);

    }
}
