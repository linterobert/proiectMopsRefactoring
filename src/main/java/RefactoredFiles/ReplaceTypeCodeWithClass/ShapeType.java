package RefactoredFiles.ReplaceTypeCodeWithClass;

public class ShapeType {
    public static final ShapeType CIRCLE = new ShapeType(1);
    public static final ShapeType RECTANGLE = new ShapeType(2);

    private final int code;

    private ShapeType(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
