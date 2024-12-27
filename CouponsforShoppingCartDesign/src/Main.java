public class Main {
    public static void main(String[] args) {

        Product item1 = new Item1("colors",400,ProductType.ACCESSORIES);
        Product item2 = new Item2("Mobile",999,ProductType.ELECTRONICS);

        Cart c = new Cart();
        c.addtoCart(item1);
        c.addtoCart(item2);
        System.out.println("Total price after discounts in the cart are : "+ c.getTotalPrice());
    }
}