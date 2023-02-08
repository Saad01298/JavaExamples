package SingletonClass;

class IamSingleton {
    static IamSingleton iamSingleton = new IamSingleton();
    private IamSingleton () {}
    public static IamSingleton getIamSingleton () {
        return iamSingleton;
    }

    private int a;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}

class Singleton {
    static Singleton singleton = new Singleton();
    private Singleton () {}

    public static Singleton getSingleton () {
        return singleton;
    }

    private int a;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

}
public class SingletonClassExample {
    public static void main(String[] args) {
        IamSingleton iamSingleton = IamSingleton.getIamSingleton();
        iamSingleton.setA(2);
        System.out.println(iamSingleton.getA());

        IamSingleton iamSingleton2 = IamSingleton.getIamSingleton();
        System.out.println(iamSingleton2.getA());
        iamSingleton2.setA(3);
        System.out.println(iamSingleton.getA());

        System.out.println("-----------------------------------");
        Singleton singleton1 = Singleton.getSingleton();
        singleton1.setA(4);
        System.out.println(singleton1.getA());

        Singleton singleton2 = Singleton.getSingleton();
        singleton2.setA(5);
        System.out.println(singleton1.getA());
    }
}
/*

class Singleton {
    static Singleton singleton = new Singleton();
    private Singleton () {}

    public static Singleton getSingleton () {
        return singleton;
    }

    private int a;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}*/
