package ThreadExamples;

class ThreadExample extends Thread {
    @Override // If we override then it won't be an error but then why are we creating thread?
    public void run () {
        try {
            System.out.println(
                    "Thread " + Thread.currentThread().getId() + " is running"
            );
        } catch (Exception e) {
            System.out.print("Exception!");
        }
    }

    void run(int a) { // Run can be overloaded but start() will call no arg run only!
        System.out.println("Overloaded Run Method");
    }

    @Override // Uncomment below code one by one and see results!
    public synchronized void start() {
        System.out.println("No Thread Called");
        //super.start(); // new thread wouldn’t be created and it will be main thread handling it.
        //super.run();   // new thread not created
    }
}

public class ThreadClassExample {
    public static void main(String[] args) {
        for (int i = 0; i < 8; i++) {
            ThreadExample threadExample = new ThreadExample();
            threadExample.start();
        }
    }
}
