class Counter1 {
    int count;

    public synchronized void increment() {
        count++;
    }

    // public void increment() {
    // count++;
    // }
}

public class TSDemo {
    public static void main(String[] args) throws InterruptedException {
        Counter1 c = new Counter1();
        Runnable obj = () -> {
            for (int i = 0; i < 1000; i++) {
                c.increment();
            }
        };
        Runnable obj1 = () -> {
            for (int i = 0; i < 1000; i++) {
                c.increment();
            }
        };
        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj1);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(c.count);
    }
}
