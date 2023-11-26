package RefactoredFiles.ExtractVariable;

public class ProductPricing {
    public static void main(String[] args) {
        double originalPrice = 50.0;
        double discountPercentage = 10.0;

        // Extracting variables for clarity
        double discountFraction = discountPercentage / 100;
        double discountedAmount = originalPrice * discountFraction;
        double discountedPrice = originalPrice - discountedAmount;

        System.out.println("Discounted Price: $" + discountedPrice);
    }
}
