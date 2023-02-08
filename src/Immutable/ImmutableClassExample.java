package Immutable;

// Normal class
public class ImmutableClassExample {
    public static void main(String[] args) {
        String a = "Hello";
        System.out.println(a);

        a = a + " Java";
        System.out.println(a);

        Immutable immutable = new Immutable("Calling Immutable Class");
        System.out.println(immutable.getMsg());

        // An inbuilt immutable class is String
        String string = new String("I am also Immutable Class");
        System.out.println(string);

        string = string + " Huuuurrah";
        System.out.println(string);

        // we can refer the referencing variable to another object, but we can't update the existing object
        immutable = new Immutable("An Update in another object");
        System.out.println(immutable.getMsg());

        string = new String("Update!");
        System.out.println(string);

        Immutable immutable1 = new Immutable("qwerty");
    }
}


// 1. Class should be final
final class Immutable {

    // 2. All members should be final and private
    private final String msg;

    // 3. Public constructor to initialize members
    Immutable(String msg) {
        this.msg = msg;
    }

    // 4. Provide public Getter function
    public String getMsg() {
        return msg;
    }

    // 5. Do not create Setter
}
