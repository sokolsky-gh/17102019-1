package DZ_Enum_1;

public enum ColorEnum {
    RED("красный"),
    BLUE("синий"),
    GREEN("зеленый");

    private String color;

    ColorEnum(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
