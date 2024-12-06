import java.util.HashMap;
import java.util.Map;

public class Cart {
    Map<Integer,Integer> productsCategoryVsCount;
    Cart(){
        productsCategoryVsCount = new HashMap<>();
    }

    public void addItemstoCart(int productCategoryid, int count){
        if(productsCategoryVsCount.containsKey(productCategoryid)){
           int prev =  productsCategoryVsCount.get(productCategoryid);
           productsCategoryVsCount.put(productCategoryid,count+prev);
        }
    }

    public void removeItemsFromCart(int productCategoryid, int count){
        if(productsCategoryVsCount.containsKey(productCategoryid)){
            int prev =  productsCategoryVsCount.get(productCategoryid);
            productsCategoryVsCount.put(productCategoryid,count-prev);
        }
    }

}
