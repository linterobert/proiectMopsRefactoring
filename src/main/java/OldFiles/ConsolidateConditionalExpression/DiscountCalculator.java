package OldFiles.ConsolidateConditionalExpression;

public class DiscountCalculator {
    public double calculateDiscount(boolean isLoyalCustomer, int customerAge) {
        double discount = 0.0;

        if (isLoyalCustomer) {
            if (customerAge > 65) {
                discount = 0.15;
            }
        } else {
            if (customerAge > 65) {
                discount = 0.10;
            }
        }

        // Additional logic for other conditions...
        return discount;
    }
}
