package OldFiles.ExtractVariable;

public class ProductPricing {
    public static void main(String[] args) {
        double originalPrice = 50.0;
        double discountPercentage = 10.0;
        double discountedPrice = originalPrice - (originalPrice * (discountPercentage/100));

        System.out.println("Discounted Price $" + discountedPrice);
    }
}
