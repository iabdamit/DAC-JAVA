class TA extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("hi");
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class TB extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("hello");
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        TA obj = new TA();
        TB obj1 = new TB();
        System.out.println(obj.getPriority());
        obj.start();
        obj1.start();
    }
}
