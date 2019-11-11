package DZ_Enum_1;

public class Brush {
    private String color;

    public Brush(ColorEnum color) {
        this.color = color.getColor();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Brush{" +
                "color='" + color + '\'' +
                '}';
    }
}

