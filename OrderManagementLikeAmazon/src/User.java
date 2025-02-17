import java.util.*;

public class User {
    private final String userId;
    private final String userName;
    private final String email;
    private final String password;
    private final List<Order> orders;

    public User(String userId, String userName, String email, String password) {
        this.userId = userId;
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.orders = new ArrayList<>();
    }

    public void addOrder(Order order){
        orders.add(order);
    }

    public String getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public List<Order> getOrders() {
        return orders;
    }
}
