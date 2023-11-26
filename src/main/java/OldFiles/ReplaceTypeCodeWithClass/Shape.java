package OldFiles.ReplaceTypeCodeWithClass;

public class Shape {
    private int type;
    private double width;
    private double height;

    public Shape(int type, double width, double height) {
        this.type = type;
        this.width = width;
        this.height = height;
    }

    public double calculateArea() {
        switch (type) {
            case 1: // Circle
                return Math.PI * Math.pow(width / 2, 2);
            case 2: // Rectangle
                return width * height;
            default:
                throw new IllegalArgumentException("Invalid shape type");
        }
    }
}
