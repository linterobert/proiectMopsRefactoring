package RefactoredFiles.AddParameter;

import java.util.List;

public class ShoppingCart {
    public double calculateTotalPrice(List<Item> items, double discount) {
        double totalPrice = 0.0;

        for (Item item : items) {
            totalPrice += item.getPrice();
        }

        // Apply the discount
        totalPrice -= totalPrice * discount;

        return totalPrice;
    }
}
