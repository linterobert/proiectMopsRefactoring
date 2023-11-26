package OldFiles.InlineMethod;

public class Calculator {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;

        int result = add(a, b);
        System.out.println("Sum: " + result);
    }

    // Original method
    public static int add(int x, int y) {
        return x + y;
    }
}
