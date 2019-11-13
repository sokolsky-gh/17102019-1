package DZ_Enum_2;

//Создать класс Utils, который будет содержать два перегруженных статических метода
public class Utils {
    private Color color;
    String text;

    //просто выводить текст в консоль:
    public static void print(String text) {
        System.out.println(text);
    }

    //выводить в консоль текст окрашенный в переданный цвет
    public static void print(String text, Color color) {
        Color eColor = color;
        System.out.println(eColor.getColor() + text + Main.ANSI_RESET);
    }

    //Дополнить enum Color статическим методом, который будет возвращать случайный объект enum Color
    public static void randomPrint(String text) {
        Color.getRandomColor();
        print(text, Color.randomColor);
    }

}