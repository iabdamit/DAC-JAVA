//todo:  Multiple threads

class TZ {

}

class TB implements Runnable {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(1);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        // Runnable obj1 = new Runnable() {
        // public void run() {
        // for (int i = 1; i <= 100; i++) {
        // System.out.println("hi");
        // try {
        // Thread.sleep(1);
        // } catch (Exception e) {
        // e.printStackTrace();
        // }
        // }
        // }
        // };
        Runnable obj1 = () -> {
            for (int i = 1; i <= 100; i++) {
                System.out.println("hi");
                try {
                    Thread.sleep(1);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };

        TB obj2 = new TB();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        // todo Priority goes from 1 to 10
        // obj2.setPriority(Thread.MAX_PRIORITY);
        // System.out.println(obj1.getPriority());
        t1.start();
        t2.start();
    }
}
