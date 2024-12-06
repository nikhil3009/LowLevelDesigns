import java.util.List;

public class ProductsCategory {
    int categoryId;
    String name;
    List<Product> productList;
    double price;

    public void addProduct(Product product){
        productList.add(product);
    }

    public void removeProducts(int count){
        for(int i=0;i<count;i++){
            productList.remove(i);
        }
    }
}
