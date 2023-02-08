package Collection.Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExamples extends Thread {
    static Map<Integer,String> map = new HashMap<>();

    public void run () {
        try {
            Thread.sleep(3000);
            map.put(1, "One");
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("Child Thread");
        }
    }
    public static void main(String[] args) throws InterruptedException {
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4, "Four");

        HashMapExamples hashMapExamples = new HashMapExamples();
        hashMapExamples.start();

        for (Map.Entry<Integer, String> o : map.entrySet()) {
            System.out.println(o);
            Thread.sleep(3000);
        }
        System.out.println(map);
    }
}
