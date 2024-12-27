import java.util.ArrayList;
import java.util.List;

public class Cart {
    List<Product> productList;

    public Cart(){
        productList = new ArrayList<>();
    }

    public void addtoCart(Product product){
        Product productWithDocounts = new TypeCouponDecorator(new PercentageCouponDecorator(product,10),3,ProductType.ACCESSORIES);
        productList.add(productWithDocounts);
    }

    public double getTotalPrice(){
        double total = 0;
        for(Product p : productList){
            total = p.getPrice();
        }
        return total;
    }
}
