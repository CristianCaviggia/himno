package shopping;

import java.util.ArrayList;

public class ShoppingCart {

    private ArrayList<Product> items;

    public ShoppingCart() {
        items = new ArrayList<>();
    }

    public double getBalance() {
        double balance = 0.00;
        for (Product item : items) {
            balance += item.getPrice();
        }
        return balance;
    }

    public void addItem(Product item) {
        items.add(item);
    }

    public void removeItem(Product item) {
        items.remove(item);
    }

    public int getItemCount() {
        return items.size();
    }

    public void empty() {
        items.clear();
    }
}
