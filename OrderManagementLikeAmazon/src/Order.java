import java.util.*;
public class Order {
    private String orderId;
    private User user;
    private  List<OrderItem> items;
    private final double totalAmount;
    private OrderStatus status;

    public Order(String orderId, User user, List<OrderItem> items) {
        this.orderId = orderId;
        this.user = user;
        this.items = items;
        this.totalAmount = calculateTotal();
        this.status = OrderStatus.PENDING;
    }

    public double calculateTotal(){
        return items.stream().mapToDouble(item->item.getProduct().getPrice() * item.getQuantity()).sum();
    }

    public String getOrderId() {
        return orderId;
    }

    public User getUser() {
        return user;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }
}
