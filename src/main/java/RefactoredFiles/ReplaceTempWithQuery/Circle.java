package RefactoredFiles.ReplaceTempWithQuery;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        double area = circle.calculateArea();

        System.out.println("Area of the circle: " + area);
    }
}
