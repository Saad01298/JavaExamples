package Collection.Map;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample extends Thread{
    static Map<Integer,String> map = new ConcurrentHashMap<>();

    public void run () {
        try {
            Thread.sleep(1000);
            map.put(4, "Three");
        } catch (InterruptedException e) {
            System.out.println("Child Thread");
        }
    }
    public static void main(String[] args) throws InterruptedException {
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Four");

        ConcurrentHashMapExample concurrentHashMapExample = new ConcurrentHashMapExample();
        concurrentHashMapExample.start();

        for (Map.Entry<Integer, String> o : map.entrySet()) {
            System.out.println(o);
            Thread.sleep(3000);
        }
        System.out.println(map);
    }
}
