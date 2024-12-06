import java.util.Map;

public class Order {
    User user;
    Address deliveryAddress;
    WareHouse wareHouse;
    Map<ProductsCategory,Integer> productsCategoryVsCount;
    Invoice invoice;
    Payment payment;

}
