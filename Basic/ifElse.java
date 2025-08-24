
class Computer {
    public void playMusic() {
        System.out.println("Playing music");
    }

    public String getMePen(int pen) {
        if (pen > 5)
            return "pen";
        return "nothing";
    }
}

public class ifElse {
    public static void main(String[] args) {
        Computer cm = new Computer();
        cm.playMusic();
        String result = cm.getMePen(6);
        System.out.println(result);
    }
}
