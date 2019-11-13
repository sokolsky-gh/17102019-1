package DZ_Enum_2;

public class Utils {
    private Color color;
    String text;

    public static void print(String text) {
        System.out.println(text);
    }

    public static void print(String text, Color color) {
        Color eColor = color;
        System.out.println(eColor.getColor() + text + Main.ANSI_RESET);
    }

    public static void randomPrint(String text) {
        Color.getRandomColor();
        print(text, Color.randomColor);
    }

}