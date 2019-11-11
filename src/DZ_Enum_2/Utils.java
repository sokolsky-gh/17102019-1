package DZ_Enum_2;

public class Utils {
    static Color color;
    static String text;

    public static void print(String text, Color color){
        Color.randomColor();
        text = "просто выводить текст в консоль";
        color = Color.randomColorResult;
        System.out.println(color + text + Main.ANSI_RESET);
    }

/*    // должен просто выводить текст в консоль123
    public static void print(String text) {
        System.out.println();
    }

    // выводить в консоль текст окрашенный в переданный цвет
    public static void print(String text, Color color) {
        System.out.println(Color.ANSI_RED + "This text is red!" + Main.ANSI_RESET);
    }*/
}