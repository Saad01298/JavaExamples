package Interview;

public class RotatingArrayExample {
    public static void main(String[] args) {
        String str = "decode";
        int r = 2;

        String rotatedStr = str.substring(r) + str.substring(0,r);

        System.out.println(rotatedStr);

    }
}
