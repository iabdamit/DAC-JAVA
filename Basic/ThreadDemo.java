//todo:  Multiple threads

class TA extends Thread {
    public void run() {

        for (int i = 1; i <= 100; i++) {
            System.out.println("hi");
            try {
                Thread.sleep(1);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

class TB extends Thread {
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
        TA obj1 = new TA();
        TB obj2 = new TB();

        // todo Priority goes from 1 to 10
        obj2.setPriority(Thread.MAX_PRIORITY);
        System.out.println(obj1.getPriority());
        obj1.start();
        obj2.start();
    }
}
