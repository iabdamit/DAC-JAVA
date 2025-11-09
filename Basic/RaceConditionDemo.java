
class RCcounting {
    int count = 0;
    // synchronized→ ensures only one thread modifies count at a time.

    public synchronized void increment() {
        count++;
    }
}

public class RaceConditionDemo {
    public static void main(String[] args) throws InterruptedException {

        RCcounting c = new RCcounting();

        // ! lambda function only used with functional interface and Ru
        Runnable obj1 = () -> {
            for (int i = 0; i < 1000; i++) {
                c.increment();
            }

        };

        Runnable obj2 = () -> {
            for (int i = 0; i < 1000; i++) {
                c.increment();
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();

        // ! join()→ ensures the main thread waits until both worker threads are done
        // ! before printing.
        t1.join();
        t2.join();
        System.out.println(c.count);
    }
}
