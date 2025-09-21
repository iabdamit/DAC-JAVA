enum Status1 {
    Running, Failed, Pending, Success;
}

public class EnumDemo {
    public static void main(String[] args) {
        Status1 s = Status1.Running;
        // System.out.println(s.ordinal());
        // Status ss[] = Status.values();
        // for (Status st : ss) {
        // System.out.println(st + " : " + st.ordinal());
        // }
        // !
        switch (s) {
            case Running:
                System.out.println("All Good");
                break;
            case Failed:
                System.out.println("Try Again...");
                break;
            case Pending:
                System.out.println("Please Wait");
                break;
            case Success:
                System.out.println("Done");
                break;
            default:
                System.out.println("......");
                break;
        }
        // !
        // if (s == Status1.Running) {
        // System.out.println("All Good");
        // } else if (s == Status1.Failed) {
        // System.out.println("Try Again...");
        // } else if (s == Status1.Pending) {
        // System.out.println("Please Wait");
        // } else {
        // System.out.println("Done");
        // }
    }
}
