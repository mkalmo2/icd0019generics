package generics.cart;

import java.util.List;

public class ShoppingCart<T> {

    public void add(Object item) {
        throw new RuntimeException("not implemented yet");
    }

    public void removeById(String id) {
        throw new RuntimeException("not implemented yet");
    }

    private boolean containsId(String id) {
        throw new RuntimeException("not implemented yet");
    }

    public Double getTotal() {
        throw new RuntimeException("not implemented yet");
    }

    public void increaseQuantity(String id) {
        throw new RuntimeException("not implemented yet");
    }

    public void applyDiscountPercentage(Double discount) {
    }

    public void cancelDiscounts() {
        throw new RuntimeException("not implemented yet");
    }

    public void addAll(List items) {
        throw new RuntimeException("not implemented yet");
    }
}
