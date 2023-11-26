package OldFiles.AddParameter;

import java.util.List;

public class ShoppingCart {
    public double calculateTotalPrice(List<Item> items) {
        double totalPrice = 0.0;

        for (Item item : items) {
            totalPrice += item.getPrice();
        }

        return totalPrice;
    }
}
