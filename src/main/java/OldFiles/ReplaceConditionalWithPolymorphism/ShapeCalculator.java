package OldFiles.ReplaceConditionalWithPolymorphism;

public class ShapeCalculator {
    public double calculateArea(Shape shape) {
        if (shape instanceof Circle) {
            return ((Circle) shape).calculateArea();
        } else if (shape instanceof Rectangle) {
            return ((Rectangle) shape).calculateArea();
        } else {
            throw new IllegalArgumentException("Unsupported shape type");
        }
    }
}
