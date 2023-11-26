package RefactoredFiles.ReplaceConditionalWithPolymorphism;

public class ShapeCalculator {
    public double calculateArea(Shape shape) {
        return shape.calculateArea();
    }
}
