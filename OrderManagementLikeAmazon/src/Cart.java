import java.util.*;
public class Cart {
    private final Map<String,OrderItem> items;

    public Cart() {
        this.items = new HashMap<>();
    }

    public void addItems(Product product, int quantity){
        String productId = product.getId();
        if(items.containsKey(productId)){
            OrderItem item = items.get(productId);
            quantity += item.getQuantity();

        }
        items.put(productId,new OrderItem(product,quantity));
    }

    public void removeItem(String productId){
        items.remove(productId);
    }

    public void updateQUantity(String productId, int quantity){
        OrderItem item = items.get(productId);
        if(item != null){
            items.put(productId,new OrderItem(item.getProduct(),quantity));
        }

    }

    public List<OrderItem> getItems() {
        return new ArrayList<>(items.values());
    }

}
