package OldFiles.ConsolidateDuplicateConditionalFragments;

public class Example {
    public static void main(String[] args) {
        int check = 0;
        double sum;
        double x = 0, y = 0, z = 0;

        if (check == 1) {
            sum = x + y;
            sum = sum * sum;
        }
        else {
            sum = x + z;
            sum = sum * sum;
        }
    }
}
