//! In Java, an enum (short for enumeration) is a special type used to define a fixed set of named constants.
//! It makes your code more readable, type-safe, and easier to maintain compared to using plain int or String constants.

enum Status {
    Running, Failed, Pending, Success;
}

public class EnumsDemos {
    public static void main(String[] args) {
        Status s1 = Status.Pending;
        // System.out.println(s1);
        // System.out.println(s1.ordinal());
        // Status[] s = Status.values();
        // for (Status status : s) {
        // System.out.println(status);
        // }

        // ! If And else
        // if (s1 == Status.Success) {
        // System.out.println("All Good");
        // } else if (s1 == Status.Failed) {
        // System.out.println("Try again");
        // } else if (s1 == Status.Pending) {
        // System.out.println("Please Wait");
        // } else {
        // System.out.println("It is running");
        // }

        // ! Switch
        switch (s1) {
            case Success -> System.out.println("All Good");
            case Failed -> System.out.println("Try again");
            case Pending -> System.out.println("Please Wait");
            case Running -> System.out.println("It is running");
        }
    }
}
