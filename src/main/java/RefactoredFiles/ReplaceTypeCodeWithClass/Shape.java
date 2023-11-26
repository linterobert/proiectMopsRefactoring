package RefactoredFiles.ReplaceTypeCodeWithClass;

public class Shape {
    private ShapeType type;
    private double width;
    private double height;

    public Shape(ShapeType type, double width, double height) {
        this.type = type;
        this.width = width;
        this.height = height;
    }

    public double calculateArea() {
        switch (type.getCode()) {
            case 1: // Circle
                return Math.PI * Math.pow(width / 2, 2);
            case 2: // Rectangle
                return width * height;
            default:
                throw new IllegalArgumentException("Invalid shape type");
        }
    }
}
