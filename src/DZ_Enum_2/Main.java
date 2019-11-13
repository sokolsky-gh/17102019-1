package DZ_Enum_2;

public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static void main(String[] args) {
        Utils.print("hey, Joe!");
        Utils.print("hey, Jude!", Color.ANSI_GREEN);
        Utils.randomPrint("Hey, teacher! Leave those kids alone!");
        Utils.randomPrint("Hey, teacher! Leave those kids alone!");
        Utils.randomPrint("Hey, teacher! Leave those kids alone!");

    }
}

