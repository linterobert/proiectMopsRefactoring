package RefactoredFiles.ConsolidateConditionalExpression;

public class DiscountCalculator {
    public double calculateDiscount(boolean isLoyalCustomer, int customerAge) {
        double discount = 0.0;

        if (customerAge > 65) {
            discount = isLoyalCustomer ? 0.15 : 0.10;
        }

        // Additional logic for other conditions...

        return discount;
    }
}
