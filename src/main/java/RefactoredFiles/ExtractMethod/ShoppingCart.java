package RefactoredFiles.ExtractMethod;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    public static void main(String[] args) {
        // Sample usage
        List<CartItem> cartItems = new ArrayList<>();
        double totalPrice = calculateTotalPrice(cartItems);
        System.out.println("Total Price: " + totalPrice);
    }

    public static double calculateTotalPrice(List<CartItem> cartItems) {
        double totalPrice = 0;

        for (CartItem item : cartItems) {
            totalPrice += item.price;
        }

        totalPrice = applyDiscountIfEligible(totalPrice);

        return totalPrice;
    }

    public static double applyDiscountIfEligible(double total) {
        if (total > 100) {
            return applyDiscount(total);
        }
        return total;
    }

    public static double applyDiscount(double total) {
        // Some discount logic
        return total * 0.9;
    }
}
