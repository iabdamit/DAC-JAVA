class Switch {
    public static void main(String[] args) {
        String day = "Monday";

        // switch (day)
        // case "Monday":
        // System.out.println("7am");
        // break;
        // case "Tuesday", "Wednesday", "Thursday", "Friday":
        // System.out.println("8am");
        // break;
        // default:
        // System.out.println("10am");
        // }

        // ! New Switch Case

        switch (day) {
            case "Monday" -> System.out.println("7am");
            case "Tuesday", "Wednesday", "Thursday", "Friday" -> System.out.println("8am");
            default -> System.out.println("9am");
        }

        // String result = switch (day) {
        // case "Monday" -> "7am";
        // case "Tuesday", "Wednesday", "Thursday", "Friday" -> "8am";
        // default -> "9am";
        // };
        // System.out.println(result);

        // ! using yield
        String result = switch (day) {
            case "Monday":
                yield "7am";
            case "Tuesday", "Wednesday", "Thursday", "Friday":
                yield "8am";
            default:
                yield "9am";
        };
        System.out.println(result);
    }
}