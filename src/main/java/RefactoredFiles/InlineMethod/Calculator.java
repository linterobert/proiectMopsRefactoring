package RefactoredFiles.InlineMethod;

public class Calculator {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;

        // Inlined method
        int result = a + b;

        System.out.println("Sum: " + result);
    }
}
