package DZ_Enum_1;

public class ColorClass {
    public static final ColorClass RED = new ColorClass("красный");
    public static final ColorClass BLUE = new ColorClass("синий");
    public static final ColorClass GREEN = new ColorClass("зеленый");
    private String color;

    private ColorClass(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}


