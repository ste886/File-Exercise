public class Shape {
    private int x;
    private int y;
    private String color;

    public Shape(int x, int y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format("Shape at coordindates (%d,%d) with color '%s'",
                x, y, color);
    }
}
