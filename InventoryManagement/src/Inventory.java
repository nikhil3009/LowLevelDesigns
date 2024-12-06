import java.util.ArrayList;
import java.util.List;

public class Inventory {
    List<ProductsCategory> productsCategoryList;
    Inventory(){
        productsCategoryList = new ArrayList<>();
    }

    public void addProductCategory(int id, String name, int price){
       ProductsCategory obj = new ProductsCategory();
       obj.categoryId  =id;
       obj.name = name;
       obj.price = price;
       productsCategoryList.add(obj);
    }
}
